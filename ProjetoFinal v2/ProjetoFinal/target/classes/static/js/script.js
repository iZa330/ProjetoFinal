// Função para exibir ou ocultar campos com base na seleção
function toggleInput(selectId, inputId) {
    const selectElement = document.getElementById(selectId);
    const inputElement = document.getElementById(inputId);

    // Quando a opção "sim" for selecionada, o campo de texto é mostrado
    if (selectElement.value === 'sim') {
        inputElement.style.display = 'block';
        inputElement.required = true;  // Marca como obrigatório
    } else {
        inputElement.style.display = 'none';
        inputElement.required = false;
        inputElement.value = ''; // Limpa o valor do campo quando ocultado
    }
}

// Submissão do formulário com campos adicionais
document.getElementById('questionarioForm').addEventListener('submit', async function (event) {
    event.preventDefault();

    const formData = new FormData(event.target);
    const data = Object.fromEntries(formData.entries());

    // Ajustar valores booleanos e verificar campos adicionais
    // Se o valor for "sim", o campo é verdadeiro, senão é falso (não será exibido)
    data.temLesao = data.temLesao === "sim" ? true : false;
    data.fezCirurgia = data.fezCirurgia === "sim" ? true : false;
    data.fazDieta = data.fazDieta === "sim" ? true : false;
    data.usoErgogenicos = data.usoErgogenicos === "sim" ? true : false;

    // Ao enviar, garantimos que mesmo com o campo oculto, o valor "não" será enviado como false
    if (!data.temLesao) data.detalhesLesao = ''; // Se não houver lesão, remove os detalhes
    if (!data.fezCirurgia) data.detalhesCirurgia = ''; // Se não fez cirurgia, remove os detalhes
    if (!data.fazDieta) data.detalhesDieta = ''; // Se não faz dieta, remove os detalhes
    if (!data.usoErgogenicos) data.detalhesErgogenicos = ''; // Se não usa ergogênicos, remove os detalhes

    try {
        const response = await fetch('http://localhost:8080/questionario', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(data)
        });

        if (response.ok) {
            alert('Questionário enviado com sucesso!');
            event.target.reset();
        } else {
            alert('Erro ao enviar o questionário. Tente novamente.');
        }
    } catch (error) {
        alert('Erro na conexão com o servidor.');
        console.error(error);
    }
});

document.getElementById('todosQuestionariosPreview').innerHTML = '<p>Carregando...</p>';

fetch('http://localhost:8080/api/questionarios')
    .then(response => response.json())
    .then(data => {
        const container = document.getElementById('todosQuestionariosPreview').querySelector('ul');
        container.innerHTML = '';  // Limpa o conteúdo anterior
        if (data.length > 0) {
            data.forEach(q => {
                const listItem = document.createElement('li');
                listItem.innerHTML = `
                    <strong>${q.nome_completo}</strong><br>
                    <em>Contato: ${q.contato_nome} (${q.contato_telefone})</em><br>
                    <small>Horas de Sono: ${q.horas_sono}</small>
                `;
                container.appendChild(listItem);
            });
        } else {
            container.innerHTML = '<p>Não há questionários cadastrados.</p>';
        }
    })
    .catch(error => {
        document.getElementById('todosQuestionariosPreview').innerHTML = 
            '<p>Erro ao carregar a lista de questionários.</p>';
        console.error(error);
    });
