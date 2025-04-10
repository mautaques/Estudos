	.data
	
endl:   .asciiz "\n"  # Declaração do quebra-linha

	.text
	.globl main
	
main:
	li $v0, 5  # Lê o dígito n
	syscall
	beqz $v0, end
	move $a0, $v0
	li $v0, 5  # Lê o dígito k
	syscall 
	move $a1, $v0
	jal conta_digitos  # Chama a função
	move $a0, $v0  # $a0 = $v0
	li $v0, 1  # Imprime o resultado
	syscall
	la $a0, endl  # Carrega a label endl p/ $a0
	li $v0, 4  # Imprime o quebra-linha
	syscall
	j main  # Faz o próximo loop

end:
	li $v0, 10  # Encerra o programa
	syscall 
	
conta_digitos:
	blt $a0, 1, caso_base  # Desvio se $a0 == 1
	addi $sp, $sp, -8
	sw $s0, 0($sp)
	sw $ra, 4($sp)
	li $t0, 10  # $t0 = 10
	div $a0, $t0  # div n/10
	mfhi $s0  # Carrega o resto p/ $s0
	mflo $a0  # Carrega o quociente p/ $a0
	jal conta_digitos  # Recursão
	bne $s0, $a1, else  # Desvio se $s0 != $a1
	addi $v0, $v0, 1
else:
	lw $s0, 0($sp)
	lw $ra, 4($sp)
	addi $sp, $sp, 8
	jr $ra  # Retorna
	
caso_base:
	li $v0, 0
	jr $ra  # Retorna se 












