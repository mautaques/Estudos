	.text
	.globl main
	
main:
	li $v0, 5  # scanf("%i",&a);
	syscall
	move $a0, $v0
	move $v0, $zero
	jal recursao
	
end:
	move $a0, $v0  # a = sum(a);
	li $v0, 1
	syscall
	li $v0, 10  # return 0;
	syscall
	
recursao:
	beqz $a0, zero  # if (x==0) return 0;
	addi $sp, $sp, -8
	sw $a0, 0($sp)	# argumento x
	sw $ra, 4($sp) 
	
	add $v0, $v0, $a0 # x + (x-1)
	addi $a0, $a0, -1  # x-1;
	jal recursao  # sum(x-1);
	
	lw $a0, 0($sp)
	lw $ra, 4($sp)	
	addi $sp, $sp, 8

zero:
	jr $ra
	