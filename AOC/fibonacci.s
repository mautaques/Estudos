.text
.globl main

# $s1: n do usuário (máx de iterações)
# $s2 e $s3: variáveis auxiliares

main:
	li $s2, 0  # $s2 = 0;
	li $s3, 1  # $s3 = 1;
	
	li $v0, 5 
	syscall

	beq $v0, $zero, zero  # se $v0 --> caso base
	beq $v0, $s3, zero # se $v0 == 1 --> caso base
	move $s1, $v0  # move o valor lido para $s1
	j loop
	
zero:
	# caso base
	addi $a0, $s3, 0
	li $v0, 1
	syscall
	j end
	
loop:
	add $s4, $s2, $s3  # $s4 = $s2 + $s3;
	move $s2, $s3  # $s2 = $s3;
	move $s3, $s4  # $s3 = $s4;
	subi $s1, $s1, 1  # $s1--;
	bne $s1, $zero, loop

output:
	# imprime
	addi $a0, $s4, 0
	li $v0, 1
	syscall
	
end:
	# fim
	li $v0, 10
	syscall

