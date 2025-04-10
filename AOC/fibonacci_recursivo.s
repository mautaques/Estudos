	.text
	.globl main
main:
	li $v0, 5 
	syscall
	move $a0, $v0 
	move $v0, $zero
	jal fibonacci  # Chama a função
	move $a0, $v1  
	li $v0, 1  # Imprime o resultado
	syscall
	
end:
	li $v0, 10
	syscall
	
fibonacci:
	blt $a0, 2, leaf
	
	addi $sp, $sp, -8
	sw $a0, 0($sp)  # salva o contexto
	sw $ra, 4($sp)
	
	addi $a0, $a0, -1  # (n-1);
	jal fibonacci  # fib(n-1);
	
	lw $a0, 0($sp)  # Restaura o contexto
	lw $ra, 4($sp)
	addi $sp, $sp, 8
	
	move $s0, $a0
	addi $a0, $a0, -2  # (n-2);
	j fibonacci  # fib(n-2);
	
leaf:
	addi $v1, $v1, 1  # fib(n-1) + fib(n-2);
	jr $ra