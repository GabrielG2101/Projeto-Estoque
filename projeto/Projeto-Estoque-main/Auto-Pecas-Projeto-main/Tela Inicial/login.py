import sqlite3

class DAOexception(Exception):
    pass

class USUdao:
    def __init__(self, db_name='Estoque.db'):
        self.connection = sqlite3.connect(db_name)
        self.cursor = self.connection.cursor()

    def verificaLoginUSU(self, email, senha):
        try:
            self.cursor.execute("SELECT * FROM Usuario WHERE email = ? AND senha = ?", (email, senha))
            return self.cursor.fetchone()
        except sqlite3.DatabaseError as e:
            raise DAOexception(e)

    def insert(self, usu):
        try:
            self.cursor.execute("INSERT INTO Usuario (usuario_id, nome, email, senha, endereço, contato, tipo, id_funcionario) VALUES (?, ?, ?, ?, ?, ?, ?, ?)",
                                (usu.id, usu.nome, usu.email, usu.senha, usu.endereço, usu.contato, usu.tipo, usu.id_funcionario))
            self.connection.commit()
        except sqlite3.DatabaseError as e:
            raise DAOexception(e)

    def update(self, usu):
        try:
            self.cursor.execute("UPDATE Usuario SET nome = ?, email = ?, senha = ?, endereço = ?, contato = ?, tipo = ?, id_funcionario = ? WHERE usuario_id = ?",
                                (usu.nome, usu.email, usu.senha, usu.endereço, usu.contato, usu.tipo, usu.id_funcionario, usu.id))
            self.connection.commit()
        except sqlite3.DatabaseError as e:
            raise DAOexception(e)

    def delete(self, usu):
        try:
            self.cursor.execute("DELETE FROM Usuario WHERE usuario_id = ?", (usu.id,))
            self.connection.commit()
        except sqlite3.DatabaseError as e:
            raise DAOexception(e)

    def findAll(self):
        try:
            self.cursor.execute("SELECT * FROM Usuario")
            return self.cursor.fetchall()
        except sqlite3.DatabaseError as e:
            raise DAOexception(e)

    def __del__(self):
        self.connection.close()

class Usuarios:
    def __init__(self, id=None, nome=None, email=None, senha=None, endereço=None, contato=None, tipo=None, id_funcionario=None):
        self.id = id
        self.nome = nome
        self.email = email
        self.senha = senha
        self.endereço = endereço
        self.contato = contato
        self.tipo = tipo
        self.id_funcionario = id_funcionario

    def logar_(self, email, senha):
        try:
            return USUdao().verificaLoginUSU(email, senha)
        except (sqlite3.DatabaseError, DAOexception) as e:
            raise e

    def cadastrar_usuario(self):
        try:
            return USUdao().insert(self)
        except (sqlite3.DatabaseError, DAOexception) as e:
            raise e

    def update_usuario(self):
        try:
            return USUdao().update(self)
        except (sqlite3.DatabaseError, DAOexception) as e:
            raise e

    def excluir_usuario(self):
        try:
            return USUdao().delete(self)
        except (sqlite3.DatabaseError, DAOexception) as e:
            raise e

    @staticmethod
    def find_all():
        try:
            return USUdao().findAll()
        except (sqlite3.DatabaseError, DAOexception) as e:
            raise e

class UsuariosController:
    def verificalogin(self, email, senha):
        if email.strip() and senha.strip():
            return Usuarios().logar_(email, senha)
        return False

    def insert(self, id, nome, email, senha, endereço, contato, tipo, id_funcionario):
        if id != -1 and nome and email and senha and endereço and contato and tipo and id_funcionario:
            usu = Usuarios(id, nome, email, senha, endereço, contato, tipo, id_funcionario)
            usu.cadastrar_usuario()

    def update(self, id, nome, email, senha, endereço, contato, tipo, id_funcionario):
        if id != -1 and nome and email and senha and endereço and contato and tipo and id_funcionario:
            usu = Usuarios(id, nome, email, senha, endereço, contato, tipo, id_funcionario)
            usu.update_usuario()

    def delete(self, id):
        if id != -1:
            usu = Usuarios(id)
            usu.excluir_usuario()

    def find_all(self):
        return Usuarios.find_all()
