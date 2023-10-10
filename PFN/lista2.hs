-- Lista 2 Mauricio Martins Taques Filho

-- Ex 1)
pertence n [] = False
pertence n (x:xs) = if n == x then True else pertence n xs

-- Ex 2)   
intercessao [] ys = []
intercessao (x:xs) (y:ys) = if pertence x (y:ys) then x:intercessao xs (y:ys) else intercessao xs (y:ys)

-- Ex 3)
inverso [] = []
inverso (x:xs) = inversoLista xs ++ [x]

-- Ex 4)
nUltimos n [] = []
nUltimos n (x:xs) = if n >= length (x:xs) then x:xs else nUltimos n xs

-- Ex 5)
soma2 [] = []
soma2 (x:xs) = [a+b|(a,b) <- x:xs]

-- Ex 6)


-- Ex 7)
intercalacao [] [] = []
intercalacao (x:xs) (y:ys) = ordenarLista ((x:xs)++(y:ys))

-- Ex 8)
menor [x] = x
menor (x:xs) = if x < menor xs then x else menor xs

-- Ex 9)
removerElem n [] = []
removerElem n (x:xs) = if n == x then xs else x:removerElem n xs

-- Ex 10)
ordenar [] = []
ordenar (x:xs) = menor (x:xs):ordenarLista (removerElem (menor(x:xs))(x:xs))

-- Ex 11)
ins n [] = [n]
ins n (x:xs) = if pertence n (x:xs) then x:xs else ordenarLista(n : (x:xs))

-- Ex 12)
enesimo n [] = -1
enesimo 1 [x] = x
enesimo n (x:xs) = if n-1 == 0 then x else enesimo (n-1) xs

-- Ex 13)


-- Ex 14)


-- Ex 15)


-- Ex 16)


-- Ex 17)

-- Ex 18)


