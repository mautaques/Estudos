# int leaf(int g, int h, int i, int j)
#     int f;
#     f = (g+h) - (i+j);
#     return f;	  

	.text
	.globl main

main:
	ori $a0, $zero, 8 # Argumento g
	ori $a1, $zero, 3 # Argumento h
	ori $a2, $zero, 2 # Argumento i
	ori $a3, $zero, 7 # Argumento j
	jal leaf
	move $a0, $v0
	li $v0, 1
	syscall

end:
	li $v0, 10
	syscall
	
leaf:
	addi $sp, $sp, -8 # desloca o topo da pilha 8 bytes
	sw $s0, 0($sp) # armazenam $s0 e $s1 na pilha($sp)
	sw $s1, 4($sp)
	add $s0, $a0, $a1
	add $s1, $a2, $a3
	sub $v0, $s0, $s1
	lw $s0, 0($sp) # restauram os valores de $s0 e $s1
	lw $s1, 4($sp)
	addi $sp, $sp, 8 # realoca os bytes na pilha para excluir os itens
	jr $ra # salta para o endereço armazenado em $ra