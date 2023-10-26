def separa_elementos(string):
    elementos_lista = string.replace(',', ' ')
    elementos_lista = elementos_lista.split()
    return elementos_lista

def automato_transicao_add(dict, elementos):
    if elementos[0] not in dict:
        dict[elementos[0]] = {}
    dict[elementos[0]][elementos[1]]= (elementos[4], elementos[2], elementos[3])
    return dict

string = input("Digite o ALFABETO (separado por vírgula): ")
ALFABETO = separa_elementos(string)

string = input("Digite o conjunto de estados (separado por vírgula): ")
ESTADOS = separa_elementos(string)

i = 0
AUTOMATO_TRANSICOES = {}
nmr_transicoes = int(input("Digite o numero de transições: "))
for i in range(nmr_transicoes):
    string = (input("Digite a transição da seguinte forma: (ESTADO ORIGEM, SIMBOLO LIDO, DESEMPILHA, EMPILHA, ESTADO CHEGADA)\
                            \n Exemplo: (Q0, a, A, b, Q1): "))
    ELEMENTOS_TRANSICOES = separa_elementos(string)
    automato_transicao_add(AUTOMATO_TRANSICOES, ELEMENTOS_TRANSICOES)
    print(AUTOMATO_TRANSICOES)

ESTADO_INCIAL = input("Digite o estado inicial: ")
string = input("Digite o conjunto de estados finais (separado por virgula): ")
ESTADOS_FINAIS = separa_elementos(string)
print(ESTADOS_FINAIS)

string = input("Digite os elementos que a pilha reconhece (separado por virgula): ")
PILHA_ELEMENTOS = separa_elementos(string)
print(PILHA_ELEMENTOS)

string = input("Digite a fita: ")
FITA = []
for s in string:
    FITA.append(s)

PILHA = list()

i = -1
ESTADO_ATUAL = ESTADO_INCIAL
while(len(FITA) != 0):
    print("FITA = "+ str(FITA))
    print("ESTADO ATUAL = " + str(ESTADO_ATUAL))
    i+=1
    ESTADO_ATUAL = AUTOMATO_TRANSICOES[ESTADO_ATUAL][FITA[i]][0]
    if AUTOMATO_TRANSICOES[ESTADO_ATUAL][FITA[i]][1] != '&':
        if(len(PILHA) == 0 or AUTOMATO_TRANSICOES[ESTADO_ATUAL][FITA[i]][1] != PILHA[-1]):
            print("FITA NAO ACEITA......") 
            break
        PILHA.pop()
    if AUTOMATO_TRANSICOES[ESTADO_ATUAL][FITA[i]][2] != '&':
        PILHA.append(AUTOMATO_TRANSICOES[ESTADO_ATUAL][FITA[i]][2])
    FITA.pop(i)


'''print(STRING_TRANSICOES)

PILHA = list()
PILHA.append("A")

print(ELEMENTOS_TRANSICOES[2])
TRANSICOES = {
    ELEMENTOS_TRANSICOES[0] : {ELEMENTOS_TRANSICOES[1] : ELEMENTOS_TRANSICOES[4]}
} 
if ELEMENTOS_TRANSICOES[2] != '&':
    PILHA.pop()
if ELEMENTOS_TRANSICOES[3] != '&':
    PILHA.append(ELEMENTOS_TRANSICOES[3])
print(TRANSICOES)
print("PILHA = " + str(PILHA))'''

#print(ALFABETO)






 
