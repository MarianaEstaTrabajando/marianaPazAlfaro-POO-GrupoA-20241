from Libreria import Libreria
from Usuario import Usuario
from Libro import Libro

"""
    Se desea crear un sistema para una librería, este sistema debe de 
    contener 3 clases, libreria (la cual contiene libros y usuarios).
    Un usuario puede rentar uno o muchos libros, pero un libro puede ser 
    rentado solo por un usuario.
    Se solicita que se puede listar a todos los usuarios con
    libros rentados y los que no.
"""


# usuario_uno = Usuario("Juan Pérez", 20)
# usuario_dos = Usuario("Pedro Medina", 35)

# libreria.agregar_usuario(usuario_uno)
# libreria.agregar_usuario(usuario_dos)

# libreria.mostrar_usuarios()

libreria = Libreria()
opcion=0
while (opcion!=9):
    print("***********************************")
    print("BIENVENIDO A LA LIBRERIA")
    print("Elige una opción para continuar")
    print("1. Añadir usuario")
    print("2. Mostrar Usuarios")
    print("3. Mostrar usuarios con libro(s)")
    print("4. Añadir libro")
    print("5. Mostrar todos los libros")
    print("6. Mostrar libros disponibles")
    print("7. Rentar libro(s)")
    print("8. Entregar libro(s)")
    print("9. Salir")
    print("***********************************\n")
    opcion = input("Ingresa la opción: ")

    if opcion == "1":
        print("\nElegiste la opción 1\n")
        cantidad=int(input("Cantidad de usuarios a ingresar: "))
        for i in range (cantidad):
            nombre = input("Ingresa el nombre del usuario: ")
            edad = int(input("Ingresa la edad del usuario: "))
            usuario = Usuario(nombre, edad)
            libreria.agregar_usuario(usuario)
            print(f"El usuario {nombre} ha sido registrado\n")

    elif opcion == "2":
        print("\nElegiste la opción 2")
        print("Se mostrarán los usuarios\n")
        libreria.mostrar_usuarios()
        
    elif opcion == "3":
        print("Usuarios con libros: ")
        libreria.mostrar_usuarios_con_libros()
        print("\n")
        
    elif opcion == "4":
        cantidad=int(input("Cantidad de libros a ingresar: "))
        for i in range (cantidad):
            nombre=input("Ingrese título del libro: ")
            autor=input("Ingrese autor: ")
            libro=Libro(nombre,autor)
            libreria.agregar_libro(libro)
            
    elif opcion == "5":
        libreria.mostrar_libros()
        
    elif opcion == "6":
        libreria.mostrar_libros_no_rentados()
        
    elif opcion == "7":
        nombre=input("Ingrese título del libro: ")
        autor=input("Ingrese autor: ")
        libro=Libro(nombre,autor)
        name=input("Ingrese nombre completo del usuario: ")
        libreria.rentar(libro,name)
    elif opcion == "8":
        nombre=input("Ingrese título del libro: ")
        autor=input("Ingrese autor: ")
        libro=Libro(nombre,autor)
        name=input("Ingrese nombre completo del usuario: ")
        libreria.devolver(libro,name)
print("Usted ha salido del programa")
    
    
