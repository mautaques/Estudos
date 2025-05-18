import numpy as np
import math
from sympy import *
from sympy.plotting import *
x1, x2, x3 = symbols('x1 x2 x3')
pi = math.pi

S = np.array([
    [0.5],
    [0.0],
    [-0.52359877]
], dtype=float)  # Sol. Aproximada

X0 = np.array([
    [0.1],
    [0.1],
    [-0.1]
], dtype=float)  # Matriz X0

n = len(X0)

# Determinação das derivadas parciais da f1(x1,x2,x3) = (x1 * 3) + cos(x2 * x3) - 1/2
f1 = (x1 * 3) + cos((x2 * x3)) - 1/2
f1_dx1 = diff(f1, x1)
f1_dx2 = diff(f1, x2)
f1_dx3 = diff(f1, x3)

# Determinação das derivadas parciais da f2(x1,x2,x3) = (x1ˆ2) - (81 * ((x2 + 0.1)ˆ2)) + sin(x3) + 1.06

f2 = (x1**2) - (81 * ((x2 + 0.1)**2)) + sin(x3) + 1.06
f2_dx1 = diff(f2, x1)
f2_dx2 = diff(f2, x2)
f2_dx3 = diff(f2, x3)

# Determinação das derivadas parciais da f1(x1,x2,x3) = exp((-x1) * x2) + (20 * x3) + (((10 * pi) - 3)/3)

print('\n')

f3 = exp((-x1) * x2) + (20 * x3) + (((10 * pi) - 3)/3)
f3_dx1 = diff(f3, x1)
f3_dx2 = diff(f3, x2)
f3_dx3 = diff(f3, x3)

# Convertendo o símbolos f1_dx1 e f3_dx3 para float
f1_dx1 = float(f1_dx1)
f3_dx3 = float(f3_dx3)

# População da matriz Jacobiana (J[x])
J = np.array([
    ([[f1_dx1, f1_dx2, f1_dx3],
    [f2_dx1, f2_dx2, f2_dx3],
    [f3_dx1, f3_dx2, f3_dx3]])
]) 

# Método do loop J[Xk] * Sk = -F[Xk] ==> Xk+1 = Xk + Sk
def newton(X0, J, tol=0.000001, limite=1000):
    X = X0.copy()  # Copia a estimativa inicial p/ X
    JCopy = J.copy() # Copia a matriz jacobiana p/ JCopy

    for k in range(limite):
        # Avaliar as funções e a Jacobiana no ponto atual
        subs = {x1: X[0, 0], x2: X[1, 0], x3: X[2, 0]}
        F = np.array([
            [float(f1.subs(subs))],
            [float(f2.subs(subs))],
            [float(f3.subs(subs))]
        ])

        JCopy = np.array([
            [f1_dx1, float(f1_dx2.subs(subs)), float(f1_dx3.subs(subs))],
            [float(f2_dx1.subs(subs)), float(f2_dx2.subs(subs)), float(f2_dx3.subs(subs))],
            [float(f3_dx1.subs(subs)), float(f3_dx2.subs(subs)), f3_dx3]
        ])

        # Resolver J * delta = -F
        delta = np.linalg.solve(JCopy, -F)
        # Resolve Xk+1 = Xk + Sk usando delta = Sk
        X = X + delta
        # Compara com a tolerância
        if np.linalg.norm(delta, ord=np.inf) < tol:          
            break

        # Imprime cada iteração
        print(f"Iteração {k+1}:")
        for i in range(n):
            print(f"X{i+1} = {X[i]}")
        print("\n")
        k += 1

    return X

solucao_obtida = newton(X0, J)

# Imprime a matriz solução aproximada
print("Solução obtida:")
for i in range(n):
    print(f"X{i+1} = {solucao_obtida[i]}")
print("\n")

print("Solução aproximada:")
for i in range(n):
    print(f"X{i+1} = {S[i]}")