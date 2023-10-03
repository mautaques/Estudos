pertence n [] = False
pertence n (x:xs) = if n == x then True else pertence n xs
   
intercessao [] ys = []
intercessao (x:xs) (y:ys) = if pertence x (y:ys) then x:intercessao xs (y:ys) else intercessao xs (y:ys)

inversoLista [] = []
inversoLista (x:xs) = (inversoLista xs) ++ [x]

nUltimos n [] = []
nUltimos n (x:xs) = if n >= length (x:xs) then (x:xs) else nUltimos n xs

enesimo n [] = -1
enesimo 1 [x] = x
enesimo n (x:xs) = if n-1 == 0 then x else enesimo (n-1) xs

repetir 0 _ = []
repetir n m = [m]++repetir (n-1) m

intercalacao [] [] = []
intercalacao (x:xs) (y:ys) = ordenarLista ((x:xs)++(y:ys))

menor [x] = x
menor (x:xs) = if x < menor xs then x else menor xs

removerElem n [] = []
removerElem n (x:xs) = if n == x then xs else x:removerElem n xs

ordenarLista [] = []
ordenarLista (x:xs) = menor (x:xs):ordenarLista (removerElem (menor(x:xs))(x:xs))

insereElem n [] = [n]
insereElem n (x:xs) = if pertence n (x:xs) then (x:xs) else ordenarLista([n] ++ (x:xs))

primeirosDuplas [] = []
primeirosDuplas ((a,b):xs) = a:primeirosDuplas xs

somaDuplas [] = []
somaDuplas (x:xs) = [a+b|(a,b) <- (x:xs)]

menoresDuplas [] = []
menoresDuplas (x:xs) = [(a,b)|(a,b) <- (x:xs), a < b]

separarDuplas n (x:xs) = ([y| y <- (x:xs), y <= n], [w| w <- (x:xs), w > n])

mdc (a,b) = if a == b then a else (if a > b then mdc ((a - b), b) else mdc (a,(b - a)))

inversoDupla [] = []
inversoDupla (x:xs) = [(b,a)|(a,b) <- (x:xs)]

simetrico (x:xs) = [a==b|(a,b) <- (x:xs)]

pares 0 = []
pares n = [(x,y)|x <- [1..n], y <- [1..n], y /= x]

inverteDNA' 'A' = 'T'
inverteDNA' 'T' = 'A'
inverteDNA' 'C' = 'G'
inverteDNA' 'G' = 'C'

inverteDNA'' [] = []                  
inverteDNA'' (x:xs) = inverteDNA' x:inverteDNA'' xs

inverteDNA xs = inversoLista (inverteDNA'' xs)

trocoCafe' 0 _ = []
trocoCafe' c [] = []
trocoCafe' c (x:xs) = if div c x > 0 then (x, div c x):trocoCafe' (rem c x) (x:xs) else trocoCafe' c xs

trocoCafe c p = trocoCafe' (p-c) [50,20,10,5]

magica' (x:xs) 1 = [x]
magica' (x:xs) n = repetir n x ++ magica' xs (n-1)

magica xs = magica' xs (length xs) ++ tail(inversoLista (magica' xs (length xs))) 
