<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "Estoque";

// Criar conexão
$conn = new mysqli($servername, $username, $password, $dbname);

// Verificar conexão
if ($conn->connect_error) {
    die("Conexão falhou: " . $conn->connect_error);
}

if (isset($_POST['register'])) {
    $nome = $_POST['nome'];
    $telefone = $_POST['telefone'];
    $email = $_POST['email'];
    $senha = $_POST['senha'];
    $datanascimento = '2000-01-01'; // Ajustar para pegar data correta
    $cpf = '000.000.000-00'; // Ajustar para pegar CPF correto

    $hashed_password = password_hash($senha, PASSWORD_DEFAULT);

    $sql = "INSERT INTO Usuario (nome, email, senha, datanascimento, cpf) VALUES ('$nome', '$email', '$hashed_password', '$datanascimento', '$cpf')";

    if ($conn->query($sql) === TRUE) {
        echo "Novo registro criado com sucesso";
    } else {
        echo "Erro: " . $sql . "<br>" . $conn->error;
    }
}

if (isset($_POST['login'])) {
    $email = $_POST['email'];
    $senha = $_POST['senha'];

    $sql = "SELECT * FROM Usuario WHERE email='$email'";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        $row = $result->fetch_assoc();
        if (password_verify($senha, $row['senha'])) {
            echo "Login realizado com sucesso";
        } else {
            echo "Senha incorreta";
        }
    } else {
        echo "Usuário não encontrado";
    }
}

$conn->close();
?>
