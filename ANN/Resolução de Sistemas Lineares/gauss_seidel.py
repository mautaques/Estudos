import numpy as np
import math

# --- Input de dados ---

A = np.array([
    [7, 1, -1, 4],
    [1, -5, 1, -2],
    [1, 0, 3, -1],
    [3, 1, -3, 8]
], dtype=float)  # Matriz A

B = np.array([
    [-10],
    [2],
    [11],
    [-24]
], dtype=float)  # Matriz B

X0 = np.array([
    [-0.3],
    [1.3],
    [2.8],
    [-2.3]
], dtype=float)  # Matriz X0

# --- Algoritmo de Gauss-Seidel ---

def gauss_seidel(A, B, X0, tol=0.0005, limite=100):
    n = len(A)  # Atribui a "n" a qntd de linhas de A
    
    for k in range(limite):
        X_atual = X0.copy()  # Faz uma cópia superficial dos valores de X0 para X_atual

        for i in range(n):
            soma = sum(A[i][j] * X_atual[j] if j < i else A[i][j] * X0[j] for j in range(n) if j != i)  # Soma dos produtos
            X_atual[i] = (B[i] - soma) / A[i][i]  # Atribuição do valor do X^(k+1)
        
        erro = max(abs(X_atual[i] - X0[i]) for i in range(n))  # Cálculo do erro
        X0 = X_atual  # Atualiza X0 com os valores atuais

        print(f"Iteração {k+1}\n")
        print(f"{X0}, Erro = {erro}\n")  # Imprime o valor de x e o erro
        
        if erro <= tol:  # Verifica se o erro é menor ou igual à tolerância
            break
    else:
        print("Número máximo de iterações atingido.")

    return X0

# --- Vetor Resíduo ---
def residuo(A, B, X):
    return B - np.dot(A, X)  # Retorna o vetor resíduo

'''
# --- Input do usuário ---

A = []

n = int(input("Digite o número de linhas da matriz A: "))  # Usuário informa o número de linhas
for i in range(n):  # Loop para ler os coeficientes da matriz A
    # Atribui a variável linha uma lista com a linha dada da matriz
    linha = list(map(float, input(f"Digite os coeficientes da linha {i+1} (separados por espaço): ").split()))
    A.append(linha) 

for i in range(n):
    print (f"linha {i+1}: {A[i]}")  # Imprime a linha lida da matriz A

B = []

for i in range(n):
    B.append(float(input(f"Digite o termo independente da linha {i+1}: ")))  # Loop para ler os coeficientes da matriz B

X0 = []

for i in range(n):
    X0.append(float(input(f"Digite o chute inicial da linha {i+1}: ")))  # Loop para ler os coeficientes da matriz X0
'''
n = len(A)  # Atribui a "n" a ordem da matriz A

# Verificacão de convergência do método
for i in range(n):
    if (abs(A[i][i]) <= sum(abs(A[i][j]) for j in range(n) if j != i)):
        print(f"O sistema diverge para X{i+1}\n")
        break
else:
    print("O sistema converge\n")

# --- Chamada da função ---

solucao = gauss_seidel(A, B, X0)  # Chama a função gauss_seidel

print("\n\n")  # Pula duas linha

print("Solução Aproximada:\n") 
for i in range(n):
    print (f"X{i+1} = {solucao[i]}")  # Imprime a matriz solução aproximada

print("\n\n")  # Pula duas linha

res = residuo(A, B, solucao)  # Chama a função residuo

print("Resíduo:\n")
for i in range(n):
    print (f"X{i+1} = {res[i]}")  # Imprime a matriz resíduo
