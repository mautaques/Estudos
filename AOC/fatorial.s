#Fatorial de 9(9!)
	
	.text
	.globl main
main:
	li $s0, 9
	li $s1, 1
	
while:
	mul $s1, $s1, $s0 # multiplicando $s1 por $s0 -1 e atribuindo a $s1
	subi $s0, $s0, 1 # $s0 = $s0 - 1;
	bnez $s0, while # se $s0 != 0 então vá para while

end:
	li $v0, 10
	syscall
