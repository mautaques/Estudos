# int v[3] = {4,3,8};
# v[2] = v[1] + 10;

.data
vector:
	.word 4
	.word 3
	.word 8
	
	.text
	.globl main
	
main:
	la $t0, vector  # carrega o endereço do vetor
	lw $t1, 4($t0)  # atribui o valor de v[1] para $t1
	addi $t1, $t1, 10  # incrementa o valor de $t1(v[1]) em 10
	sw $t1, 8($t0)
	
end:
	li $v0, 10
	syscall	
	
