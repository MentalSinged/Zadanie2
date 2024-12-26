import random

def create_filled_array(size, min_val, max_val):
    return [random.randint(min_val, max_val) for _ in range(size)]

"""
******************************************************
nazwa funkcji: find_element
Argumenty: array - lista wartosci wsrod ktorych nalezy znalezc szukana wartosc
           value - wartosc do znalezienia
Typ zwracany: Jezeli element jest znaleziony to zwraca int jezeli nie to None
Informacje: Zaimplementowany algorytm wyszukuje podana wartosc w tablicy elementow. tak zwane wyszukiwanie z wartownikiem
Autor: ja
*****************************************************
"""

def find_element(array, value):
    n = len(array)
    array.append(value)

    i = 0
    while array[i] != value:
        i += 1

    array.pop()

    if i == n:
        return None
    return i

if __name__ == "__main__":
    size = 50
    min_val = 1
    max_val = 100
    value_to_search = int(input("Wprowadz element do wyszukania: "))
    array = create_filled_array(size, min_val, max_val)
    print(", ".join(map(str, array)))
    index = find_element(array, value_to_search)
    if index == None:
        print(f"Wartość nie została znaleziona w tablicy.")
    else:
        print(f"Wartość {value_to_search} została znaleziona pod indeksem {index}.")
