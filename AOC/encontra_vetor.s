	.data
	
array: 	
	.align 2
	.space 40
	
printf:	.asciiz "Encontrou em: "
printf2: .asciiz "Não está no vetor"
	
	.text
	.globl main
	
main: 
	li $v0, 5
	syscall
	move $t2, $v0
	
loop:
	beq $t0, 40, search  # for(i=0;i<40;i++)
	
	li $v0, 5  # scanf
	syscall
	move $t1, $v0
	sw $t1, array($t0)  # array[i] = t1;
	addi $t0, $t0, 4  # i = i + 4;
	j loop
	
search:
	beq $t4, 40, leaf
	lw $t3, array($t4)
	beq $t3, $t2, end
	addi $t4, $t4, 4  # j = j + 4;
	j search  
	
	
end:
	la $a0, printf  # Carrega a label printf p/ $a0
	li $v0, 4  # Imprime a string
	syscall
	move $a0, $t4
	li $v0, 1
	syscall
	li $v0, 10
	syscall
	
leaf:
	la $a0, printf2  # Carrega a label printf p/ $a0
	li $v0, 4  # Imprime a string
	syscall
	li $v0, 10
	syscall