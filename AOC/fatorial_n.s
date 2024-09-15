#Fatorial de n
	
.text
.globl main

main:
	li $v0, 5 # Input do usuário
	syscall
	addi $s0, $v0, 0 # Move $v0 para $s0
	li $s1, 1
	
while:
	#mul $s1 $s1 $s0 --- Multiplicando usando mul
	mult $s0, $s1 # Multiplica $s0 e $s1 e aloca o resultado em lo
	mflo $v1 # Move lo para $v1
	addi $s1, $v1, 0 # Move $v1 para $s0 
	subi $s0, $s0, 1 # $s0 = $s0 - 1;
	bnez $s0, while # Se $s0 != 0 então vá para while
	addi $a0, $s1, 0 # Move o valor a ser imprimido para $a0
	li $v0, 1
	syscall

end:
	li $v0, 10
	syscall