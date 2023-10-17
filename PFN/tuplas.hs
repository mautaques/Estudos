
primeiro (x,y) = x

segundo (x,y) = y

procura c [] = []
procura c ((c',n):xs) = if c == c' then n else procura c xs

procura' c [] = []
procura' c (x:xs) = if fst x == c then snd x else procura' c xs

segundos [] = []
segundos ((a,b):xs) = b:segundos xs

agrupar xs [] = []
agrupar [] ys = []
agrupar (x:xs) (y:ys) = (x,y):agrupar xs ys

primeiro' (x,y,z) = x

segundo' (x,y,z) = y

terceira' (x,y,z) = z