	.data
	
erro:	.asciiz "ERRO"
endl:	.asciiz "\n"
			
	.text 
	.globl main
	
	li $t2, 0  # atribuindo o valor de 0 para o contador $t2
main:
	li $v0, 5  # input n do usuário
	syscall 
	addi $s1, $v0, 0  # move o valor de $v0 para $s0
	bltz $s1, print  # se o valor for menor do que zero vá para print
	
soma: 
	ori $t0, $s1, 0  # move o valor de $s0 para $t1
	add $t1, $t1, $t0  # soma os valores e armazena em $t1
	addi $t2, $t2, 1  # $t2++;
	
media:
	div $t3, $t1, $t2  # divide o registrador $t1 pelo $t2
	mflo $t4  # atribui o quociente da divisão para o registador $t4
	j main  # volta para a main para receber um outro número

print:
	addi $a0, $t1, 0
	li $v0, 1  # Imprime a soma
	syscall
	
	la $a0, endl
	li $v0, 4  # Imprime a quebra de linha
	syscall  
	
	beqz $t2, excessao  # se $s1 for igual a zero, va para a excessao
	
	addi $a0, $t4, 0
	li $v0, 1  # Imprime a média
	syscall 
	j end
	
excessao:
	la $a0, erro
	li $v0, 4  # Imprime a mensagem de excessão
	syscall 

end:
	li $v0, 10  # código para encerrar o programa
	syscall  # encerra o programa
