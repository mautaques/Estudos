	.text
	.globl main
main:
	li $v0, 5
	syscall
	move $a0, $v0
	jal fatorial
	move $a0, $v0
	li $v0, 1
	syscall
	
end:
	li $v0, 10
	syscall
	
fatorial:
	blt $a0, 1, fat_parada  # if ($a0 < 1) --> fat_parada
	
	addi $sp, $sp, -8
	sw $s0, 0($sp)
	sw $ra, 4($sp)
	
	move $s0, $a0  # $s0 <-- $a0
	addi $a0, $a0, -1
	jal fatorial
	mul $v0, $v0, $s0  # $v0 = $v0 * $s0
	
	lw $s0, 0($sp) # restaura a pilha
	lw $ra, 4($sp)
	addi $sp, $sp, 8
	
	jr $ra # return
	
fat_parada:
	li $v0, 1
	jr $ra  # retorna quando $a0 < 1
	
	
	
	
	