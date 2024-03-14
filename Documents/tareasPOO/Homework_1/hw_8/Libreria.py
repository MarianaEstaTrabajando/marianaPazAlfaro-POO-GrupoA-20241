class Libreria:
    __usuarios = []
    __libros = []

    def agregar_usuario(self, usuario):
        self.__usuarios.append(usuario)

    def agregar_libro(self, libro):
        self.__libros.append(libro)
        
    def mostrar_libros_no_rentados(self):
        print("*** LIBROS ***")
        for libro in self.__libros:
            if(libro.get_rentado()==False):
              libro.get_data()
            
    def mostrar_libros(self):
        print("*** LIBROS ***")
        for libro in self.__libros:
            libro.get_data()
            
    def mostrar_usuarios(self):
        print("*** USUARIOS **")
        for usuario in self.__usuarios:
            
            print(usuario.get_nombre())
            
    def rentar(self,libro, name):
        for i in self.__libros:
            
            if(i.get_nombre()==libro.get_nombre() and i.get_autor()==libro.get_autor()):
                if(i.get_rentado()==False):
                    for a in self.__usuarios:
                        if(a.get_nombre()==name):
                            i.rentar()
                            a.rentar_libro(i)
                else:
                    print("El libro está rentado\n")       
                         
    def devolver(self,libro, name):
        for i in self.__libros:
            if(i.get_nombre()==libro.get_nombre() and i.get_autor()==libro.get_autor()):
                if(i.get_rentado()):
                    for a in self.__usuarios:
                        if(a.get_nombre()==name):
                                i.devolver()
                                a.devolver_libro(i.get_nombre())
                        
    def mostrar_usuarios_con_libros(self):
        self.si=0
        for i in self.__usuarios:
           if( i.have_a_book()):
               print("Usuario: ")
               print(i.get_nombre())
               i.show_books()
               self.si=self.si+1
        if(self.si==0):
          print("No hay libros rentados\n") 
