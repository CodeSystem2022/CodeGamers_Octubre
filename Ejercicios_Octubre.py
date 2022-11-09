# Ejercicios de Octubre en Python



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
