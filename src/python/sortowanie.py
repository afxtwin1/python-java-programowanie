# insertion sort 
# pracuje on w miejscu zajmuje jedno miejsce w pamięci przez cały czas działania
# Złożoność:
# - Średni przypadek: O(n^2)
# - Najlepszy przypadek: O(n)
# - Najgorszy przypadek: O(n^2) 
# Algorytm działa w miejscu, co oznacza, że zajmuje O(1) dodatkowej pamięci. 

#--------------------------------------------------------------------#

def insertion_sort(arr):
    # Przechodzimy przez każdy element od drugiego do ostatniego
    for i in range(1, len(arr)):
        temp = i  # Ustawiamy indeks aktualnego elementu
        # Porównujemy element z poprzednimi w posortowanej części
        while temp > 0 and arr[temp - 1] > arr[temp]:
            # Jeśli element poprzedni jest większy, zamieniamy je miejscami
            arr[temp], arr[temp - 1] = arr[temp - 1], arr[temp]
            temp -= 1  # Cofamy się o jeden indeks w posortowanej części
    return arr  # Zwracamy posortowaną tablicę

A = [1,8,6,7,4,2]

print(f"Sortowanie Insertionsort: {insertion_sort(A)}\n")

#--------------------------------------------------------------------#

# QuickSort - sortowanie przez podział
# Działa w podejściu "dziel i zwyciężaj", gdzie tablica jest dzielona na dwie części
# względem elementu pivot, a następnie każda część jest sortowana rekurencyjnie.
# Złożoność:
# - Średni przypadek: O(n log n)
# - Najlepszy przypadek: O(n log n)
# - Najgorszy przypadek: O(n^2) (gdy pivot jest zawsze najgorszym wyborem, np. największym elementem)
# Algorytm działa w miejscu, co oznacza, że zajmuje O(1) dodatkowej pamięci.

# Funkcja partition - dzieli tablicę na dwie części względem pivota
def partition(A, p, r):
    x = A[r]  # Wybieramy pivot jako ostatni element tablicy
    i = p - 1  # Granica elementów mniejszych lub równych pivotowi (inicjalnie przed zakresem)
    for j in range(p, r):  # Iterujemy przez wszystkie elementy poza pivotem
        if A[j] <= x:  # Jeśli element jest mniejszy lub równy pivotowi
            i += 1  # Przesuwamy granicę dla mniejszych elementów
            A[i], A[j] = A[j], A[i]  # Zamieniamy elementy miejscami
    A[i + 1], A[r] = A[r], A[i + 1]  # Umieszczamy pivot na swojej właściwej pozycji
    return i + 1  # Zwracamy indeks pivota

# Funkcja QuickSort - rekurencyjnie sortuje tablicę
def Quicksort(A, p, r):
    if p < r:  # Warunek, aby podtablica miała więcej niż jeden element
        q = partition(A, p, r)  # Dzielimy tablicę na dwie części
        Quicksort(A, p, q - 1)  # Rekurencyjnie sortujemy lewą część (elementy mniejsze/równe pivotowi)
        Quicksort(A, q + 1, r)  # Rekurencyjnie sortujemy prawą część (elementy większe od pivota)
    return A

B = [3, 8, 6, 2, 7, 4]

print(f"Sortowanie Quicksort: {Quicksort(B, 0, len(B) - 1)}\n")

#--------------------------------------------------------------------#

# MergeSort - sortowanie przez scalanie
# Działa na zasadzie "dziel i zwyciężaj", gdzie tablica jest dzielona na dwie części
# i scalana w porządku rosnącym.
# Złożoność:
# - Średni przypadek: O(n log n)
# - Najlepszy przypadek: O(n log n)
# - Najgorszy przypadek: O(n log n)
# Algorytm nie działa w miejscu, ponieważ tworzą się nowe tablice pomocnicze.

# Funkcja merge - scalanie dwóch posortowanych podtablic
# A - tablica wejściowa
# p - początek zakresu
# q - środek zakresu
# r - koniec zakresu

#--------------------------------------------------------------------#

def merge(A, p, q, r):
    # Obliczamy rozmiary podtablic
    n1 = q - p + 1
    n2 = r - q

    # Tworzymy nowe tablice dla lewej i prawej części
    L = [0] * (n1 + 1)
    R = [0] * (n2 + 1)

    # Kopiujemy dane do tablic L i R
    for i in range(0, n1):
        L[i] = A[p + i]
    for j in range(0, n2):
        R[j] = A[q + 1 + j]

    # Dodajemy wartowniki (nieskończoność) na końcu tablic
    L[n1] = float('inf')
    R[n2] = float('inf')

    i = 0  # Indeks dla tablicy L
    j = 0  # Indeks dla tablicy R

    # Scalanie tablic L i R z powrotem do A
    for k in range(p, r + 1):
        if L[i] <= R[j]:
            A[k] = L[i]
            i += 1
        else:
            A[k] = R[j]
            j += 1

# Funkcja MergeSort - rekurencyjnie dzieli tablicę na podtablice i je scala
# A - tablica wejściowa
# p - początek zakresu
# r - koniec zakresu

def merge_sort(A, p, r):
    if p < r:  # Warunek bazowy: podtablica zawiera więcej niż jeden element
        # Znajdujemy środek tablicy
        q = (p + r) // 2

        # Rekurencyjnie sortujemy lewą część
        merge_sort(A, p, q)

        # Rekurencyjnie sortujemy prawą część
        merge_sort(A, q + 1, r)

        # Scalanie posortowanych części
        merge(A, p, q, r)

    return A  # Zwracamy posortowaną tablicę

C = [8, 3, 7, 4, 6, 2, 5, 1]

print(f"Sortowanie Mergesort: {merge_sort(C,0,7)}")

#--------------------------------------------------------------------#






