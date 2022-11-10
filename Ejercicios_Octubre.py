# Ejercicios de Octubre en Python

# Guala Pablo Nicolas
class Rectangulo:
    """
    Crear una clase llamada rectangulo, debe tener 2 atributos: altura y base
    el nombre del metodo sera calcular area utilizando la formula:
    area = base * altura. Pero la base y la altura deben ser ingresadas por
    el usuario y los objetos deben se tres
    """

    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    def calcular_area(self):
        return self.altura * self.base

# Pedimos al usuario que nos ingrese los valores para los tres rectangulos
altura1 = int(input('Digite el valor para la altura: '))
base1 = int(input('Digite el valor para la base: '))

altura2 = int(input('Digite el valor para la altura: '))
base2 = int(input('Digite el valor para la base: '))

altura3 = int(input('Digite el valor para la altura: '))
base3 = int(input('Digite el valor para la base: '))

# Creamos los tres objetos
rectangulo1 = Rectangulo(altura1, base1)
print(f'El area del primer rectangulo es: {rectangulo1.calcular_area()}')

rectangulo2 = Rectangulo(altura2, base2)
print(f'El area del segundo rectangulo es: {rectangulo2.calcular_area()}')

rectangulo3 = Rectangulo(altura3, base3)
print(f'El area del tercer rectangulo es: {rectangulo3.calcular_area()}')



# Di Stefano Mara

def calcular_total_pago(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
    return pago_total

pago_sin_impuesto = float(input("Ingrese el monto sin impuesto: "))
impuesto = float(input("Ingrese el monto del impuesto: "))
pago_con_impuesto = calcular_total_pago(pago_sin_impuesto, impuesto)
print(f"Monto con impuestos TOTAL: {pago_con_impuesto}")



# Di Stefano Diego

class Cubo:
     def __init__(self,ancho, alto, profundidad):
          self.ancho = ancho
          self.alto = alto
          self.profundidad = profundidad

     def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad
      
ancho = int(input('Ancho: '))
alto = int(input('Alto: '))
profundidad = int(input('Profundidad: '))

cubo1 = Cubo(ancho,alto,profundidad)
print(f'El volumen es: {cubo1.calcular_volumen()}')





# Roberto Di Stefano
class Rectangulo:
    """
    Creamos una clase llamada Rectangulo, debe tenér 2 atributos: altura y base
    el nombre del método sera calcular area utilizando la formula:
    area = base * altura. Pero la base y la altura deben ser ingresadas por
    el usuario y los objetos deben ser tres.
    """

    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    def calcular_area(self):
        return self.base * self.altura

base = int(input('Digite el número para la base del rectangulo: '))
altura = int(input('Digite el número para la altura del rectangulo: '))
rectangulo1 = Rectangulo(base, altura)
print(f'El area del rectangulo es: {rectangulo1.calcular_area()}')
