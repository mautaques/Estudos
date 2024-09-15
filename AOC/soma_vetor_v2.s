# int v[8] = {12, 3, 10, 7, 5, 1, 0, 99};
# v[7] = v[1] + v[2] + v[3] + 42;

.data 
vector:
	.word 12
	.word 3
	.word 10
	.word 7
	.word 5
	.word 1
	.word 0
	.word 99
	
	.text
	.globl main
	
main:
	la $t0, vector # carrega o vetor
	lw $t1, 4($t0) # atribui o valor de v[1] para $t1
	lw $t2, 8($t0) # atribui o valor de v[2] para $t2
	lw $t3, 12($t0) # atribui o valor de v[3] para $t3
	add $t2, $t2, $t1 # soma $t1 com $t2 e aloca em $t2
	addi $t3, $t3, 42 # soma $t3 com o imediato 42 e aloca em $t3
	add $t3, $t3, $t2 # soma $t2 com $t3 e aloca em $t3
	sw $t3, 28($t0) # atribui o valor de $t3 para a posição v[7]
 
 print:
	addi $a0, $t3, 0
	li $v0, 1
	syscall
	
end:
	li $v0, 5
	syscall	
	
