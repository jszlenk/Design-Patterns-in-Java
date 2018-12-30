# Wzorce Projekotwe w Java

![Algorithms](https://img.shields.io/badge/Design--Patterns-Implementation--in--Java-green.svg?longCache=true&style=for-the-badge)

Wzorzec projektowy (ang. design pattern) – uniwersalne, sprawdzone w praktyce rozwiązanie często pojawiających się, powtarzalnych problemów projektowych. Pokazuje powiązania i zależności pomiędzy klasami oraz obiektami i ułatwia tworzenie, modyfikację oraz pielęgnację kodu źródłowego. Jest opisem rozwiązania, a nie jego implementacją. Wzorce projektowe stosowane są w projektach wykorzystujących programowanie obiektowe.

### Wzorce rozwiązań

Wzorce projektowe najczęściej tworzone są w oparciu o programowanie obiektowe. Zakres tego pojęcia stał się problemem rozważanym od połowy lat 90. XX wieku. Ostatecznie ustalono, że algorytmy nie są wzorcami projektowymi, jako że rozwiązują problemy obliczeniowe, a nie projektowe. Wzorce często są łączone w celu rozwiązania bardziej złożonego problemu.

Zamiast skupiać się na funkcjonowaniu poszczególnych elementów, wzorce projektowe stanowią abstrakcyjny opis zależności pomiędzy klasami, co w efekcie wprowadza pewną standaryzację kodu oraz zwiększa jego zrozumiałość, wydajność i niezawodność. Wartość wzorców projektowych stanowi nie tylko samo rozwiązanie problemu, ale także dokumentacja, która wyjaśnia cel, działanie, zalety danego rozwiązania, co pomaga w łatwiejszym stosowaniu i adaptacji wzorców w danym zastosowaniu.

Wzorce projektowe mogą przyspieszyć proces rozwoju oprogramowania przez dostarczenie wypróbowanych rozwiązań dla problemów, które mogą nie być oczywiste na początku procesu projektowego. Często zagadnienia te wiążą się rules ewolucją oczekiwań względem projektowanego systemu: rozszerzeniem jego funkcjonalności, zmianą sposobu i formatu wprowadzanych danych czy dostosowaniem aplikacji do różnych klas użytkowników. Nieuwzględnienie ich na początku procesu rozwoju produktu programistycznego powoduje często konieczność gruntownego przebudowywania zaawansowanego lub gotowego już oprogramowania.

### Klasyfikacja podstawowa

Wzorce możemy podzielić na trzy rodziny:

   - kreacyjne (konstrukcyjne) – opisujące proces tworzenia nowych obiektów; ich zadaniem jest tworzenie, inicjalizacja oraz konfiguracja obiektów, klas oraz innych typów danych;
   - strukturalne – opisujące struktury powiązanych ze sobą obiektów;
   - czynnościowe (behawioralne, operacyjne – opisujące zachowanie i odpowiedzialność współpracujących ze sobą obiektów.


[Wikipedia](https://pl.wikipedia.org/wiki/Wzorzec_projektowy_(informatyka))

------

### Creational Design Patterns: 

 - Builder
 - Factories
   - Factory Method  
   - Abstract Factory 
 - Prototype 
 - Singleton

### Structrural Design Patterns:

 - Adapter
 - Bridge
 - Composite
 - Decorator
 - Façade
 
**Flyweight**

  Pyłek (ang. Flyweight) – strukturalny wzorzec projektowy, którego celem jest zmniejszenie wykorzystania pamięci poprzez poprawę efektywności obsługi dużych obiektów zbudowanych z wielu mniejszych elementów poprzez współdzielenie wspólnych małych elementów. Należy do grupy wzorców skatalogowanych przez Gang of Four. 

  Wzorzec Pyłek stosuje się tam, gdzie jedna klasa ma wiele egzemplarzy, a każdy z tych egzemplarzy może być sterowany w ten sam sposób. Przykładowo tenże wzorzec można zastosować w programie wspomagającym modelowanie przestrzenne terenu. Jednym z wielu elementów, które muszą się w nim znaleźć są obiekt reprezentujący drzewo. Zakładamy, że obiekt taki posiada informacje o wyglądzie drzewa oraz jakieś inne jego cechy, przy czym także jego wysokości oraz jego współrzędne położenia. Podczas modelowania wielkich kompleksów zieleni złożonych z wielu egzemplarzy drzewa program może zacząć działać niezadowalająco wolno. Aby uporać się z takim problemem można zastosować wzorzec Pyłek. Po zastosowaniu tego wzorca projektowego zamiast tworzyć indywidualny egzemplarz klasy (obiekt) dla każdego drzewa możliwe jest stworzenie kompleksowego obiektu, który będzie w sobie zawierał informacje o wszystkich drzewach renderowanych na modelowanym terenie. W takim obiekcie z racji tego, że wszystkie renderowane drzewa mają pewne cechy wspólne, takie jak np. wygląd, informacje te będą zapisane tylko raz (choć drzew może być tysiące), a zwielokrotniane będą jedynie informacje różne dla każdego drzewa tak jak np. współrzędne i wysokość. Sposób wykonania tej idei oraz jej implementacja zależy od woli programisty. 

  Istotą wzorca jest podział danych przechowywanych w ciężkim obiekcie na wewnętrzne i zewnętrzne. Do klasy danych wewnętrznych wybierane są te składowe ciężkiej klasy pierwotnej, których wartości często się powtarzają. Pozostałe składowe stanowią dane zewnętrzne. Po ustaleniu podziału zamiast ciężkich obiektów wzorzec wprowadza odpowiadające im obiekty klientów oraz tzw. obiekty pyłków. Obiekty pyłków są tworzone z wybranych wcześniej danych wewnętrznych. Każdy z nich jest współdzielony przez wielu klientów i nie można go modyfikować. Dane zewnętrzne, unikatowe dla każdego obiektu klienta, są dostarczane obiektowi pyłku poprzez określone metody. Wzorzec zawiera dwóch uczestników - Fabrykę Pyłków i Pyłek. Klient nie tworzy egzemplarzy typu Pyłek samodzielnie, a jedynie wysyła do Fabryki żądanie ich udostępnienia. Fabryka zwraca Klientowi istniejący Pyłek lub tworzy nowy, jeśli żaden egzemplarz tej klasy jeszcze nie istnieje. 
  
  Ideą wzorca projektowego pyłek jest stworzenie prostego mechanizmu współdzielenia obiektu o niewielkim rozmiarze przez wiele obiektów w celu zwiększenia wydajności systemu pod względem zużycia pamięci. Zamiast zapisywać oddzielnie kilka olbrzymich obiektów, dzielmy owe obiekty na mniejsze składowe i elementy które się w nich powtarzają zapisujemy tylko raz,a nie kilka razy. Mówiąc inaczej pyłek ma na celu udostępnianie pojedynczego małego obiektu wielu klientom(dużym obiektom). Implementując ten wzorzec projektowy należy rozwiązać problem wspólnego dostępu do współdzielonych danych. Jednym ze sposobów realizacji tego mechanizmu jest podział danych przechowywanych w atrybutach obiektów (te mniejsze elementy) na współdzielone dane wewnętrzne intrinsicState oraz niewspółdzielone, unikatowe dla każdego obiektu dane zewnętrzne allState. Czyli dwie grupy złożone z małych elementów.
  
  Wzorzec ten można formalnie zrealizować za pomocą trzech głównych elementów: 
            
   - elementu abstrakcyjnego Flyweight definiującego operacje służące do przyjmowania i odtwarzania stanu zewnętrznego obiektu opisywanego przez klasę UnsharedConcreteFlyweight
   - obiektu tworzonego na bazie klasy ConcreteFlyweight przechowującego stan wewnętrzny (współdzielony) obiektu, który dodatkowo jest niezależny od kontekstu wywołania
   - fabryki FlyweightFactory, której zadaniem jest kreowanie i składowanie obiektów realizujących interfejs Flyweight

**Proxy**

### Behavioral Design Patterns:

 - Chain of Responsibility 
 - Command
 - Interpreter
 - Iterator 
 - Mediator 
 - Memento
 - Null Object 
 - Observer 
 
**State** 
 
  Stan – czynnościowy wzorzec projektowy, który umożliwia zmianę zachowania obiektu poprzez zmianę jego stanu wewnętrznego. Innymi słowy – uzależnia sposób działania obiektu od stanu w jakim się aktualnie znajduje.
   
  Rozważmy aplikację, której zadaniem jest rysowanie różnych obiektów za pomocą różnych komponentów. Aplikacja taka może posiadać abstrakcyjny interfejs reprezentujący narzędzie do rysowania implementowany przez klasy konkretnych narzędzi. Klasa główna będzie wywoływać odpowiednie narzędzie do rysowania - w zależności od tego w jakim będzie stanie. 
 
**Strategy** 

  Strategia – czynnościowy wzorzec projektowy, który definiuje rodzinę wymiennych algorytmów i kapsułkuje je w postaci klas. Umożliwia wymienne stosowanie każdego z nich w trakcie działania aplikacji niezależnie od korzystających z nich użytkowników.
    
  We wzorcu Strategia definiujemy wspólny interfejs dla wszystkich obsługiwanych algorytmów i zawierający wszystkie dozwolone operacje. Następnie implementujemy go w poszczególnych klasach dostarczających konkretne algorytmy. Dodatkowo, we wzorcu wyróżniamy także klienta korzystającego z algorytmów. Posiada on referencję do aktualnie używanej strategii oraz metodę ustawStrategie(), która pozwala ją zmienić.
  
  Elementy wzorca:
  
  _Strategia — interfejs definiujący operacje, które muszą obsługiwać wszystkie dostępne algorytmy. Zakładamy, że wszyscy klienci zainteresowani wykorzystaniem algorytmów będą używać właśnie tego interfejsu.
  Konkretna strategia — implementuje określony algorytm zgodnie ze zdefiniowanym interfejsem.
  Klient — użytkownik rodziny algorytmów posiadający referencję do obiektu Strategia._
  
  Istotne jest, że obiekty Klient oraz Strategia współpracują ze sobą w celu wykonania określonego zadania. Klient wykonuje wszystkie ogólne zadania i nadzoruje przepływ sterowania, zaś strategie implementują te części zadania, które można wymieniać. Oficjalna wirtualna maszyna Javy HotSpot wykorzystuje wzorzec Strategia w wewnętrznej implementacji mechanizmu odśmiecania pamięci, oferując do wyboru kilka algorytmów różniących się właściwościami. Programista wybiera strategię odśmiecania najlepiej dopasowaną do profilu jego aplikacji. Innym miejscem zastosowania wzorca jest sytuacja, w której poszczególne strategie rozwiązują inny problem. Za ilustrację może posłużyć tutaj sklep internetowy posiadający swoje oddziały w kilku krajach różniących się obowiązującymi w nich przepisami podatkowymi. Klient implementuje podstawową, wspólną dla wszystkich funkcjonalność, zaś operację naliczenia podatku deleguje do strategii zaimplementowanej dla konkretnego kraju.  
  
**Template Method** 
 
  Metoda szablonowa – czynnościowy wzorzec projektowy. Jego zadaniem jest zdefiniowanie metody, będącej szkieletem algorytmu. Algorytm ten może być następnie dokładnie definiowany w klasach pochodnych. Niezmienna część algorytmu zostaje opisana w metodzie szablonowej, której klient nie może nadpisać. W metodzie szablonowej wywoływane są inne metody, reprezentujące zmienne kroki algorytmu. Mogą one być abstrakcyjne lub definiować domyślne zachowania. Klient, który chce skorzystać z algorytmu, może wykorzystać domyślną implementację bądź może utworzyć klasę pochodną i nadpisać metody opisujące zmienne fragmenty algorytmu. Najczęściej metoda szablonowa ma widoczność publiczną, natomiast metody do przesłonięcia mają widoczność chronioną lub prywatną, tak, aby klient nie mógł ich użyć bezpośrednio. Inna popularna nazwa tego wzorca to niewirtualny interfejs (ang. non virtual interface). Mimo zbieżnej nazwy, wzorzec ten nie ma niczego wspólnego z szablonami, stosowanymi w programowaniu uogólnionym. 
 
  Przykładem zastosowania tego wzorca są biblioteki, wspomagające automatyzację testów jednostkowych. Biblioteka jUnit definiuje ogólny algorytm wykonywania testów. Składa się on z trzech podstawowych kroków: przygotowania środowiska do wykonania testów, wykonania testów, a następnie posprzątania po wykonanych testach. Kroki te reprezentowane są przez metody setUp, runTest oraz tearDown. Wymienione metody wykonywane są w niezmiennej kolejności przez metodę run, której klient nie może zmienić. Dzięki temu, użytkownik nie może zmieniać kolejności podstawowych bloków algorytmu, może jednak nadpisać metody setUp, runTest oraz tearDown, co pozwala mu dostosować testy do swoich potrzeb. 
 
  Wzorzec składa się z co najmniej dwóch klas. Klasa podstawowa AbstractClass definiuje szkielet algorytmu i jest bazą, z której korzysta klient. Składa się z metody szablonowej templateMethod, która jest publiczna i której klient nie ma możliwości rozszerzyć, oraz z metod prywatnych (lub chronionych) method1 oraz method2, które są wykorzystywane w metodzie templateMethod i zawierają domyślną implementację algorytmu. Klient chcący zmienić któryś z kroków algorytmu, musi zdefiniować klasę pochodną ConcreteClass, w której przedefiniuje jedną bądź wszystkie prywatne metody, implementujące kolejne kroki algorytmu. 
 
  Zaletą wzorca jest możliwość zdefiniowania algorytmu składającego się z niezmiennej sekwencji kroków z jednoczesną możliwością modyfikacji wybranych przez klienta kroków. Stosowanie tego wzorca często jest określane jako "zasada Hollywood", która mówi "nie dzwoń do nas, my zadzwonimy do ciebie" – jest to nawiązanie do sytuacji, w której to klasa bazowa wywołuje metody klasy pochodnej, a nie odwrotnie. 
 
**Visitor**

  Odwiedzający (wizytator) – wzorzec projektowy, którego zadaniem jest odseparowanie algorytmu od struktury obiektowej na której operuje. Praktycznym rezultatem tego odseparowania jest możliwość dodawania nowych operacji do aktualnych struktur obiektów bez konieczności ich modyfikacji.

  We wzorcu projektowym wprowadzony zostaje nowy typ obiektu Wizytator, którego zadaniem jest "odwiedzenie" każdego elementu w danej strukturze obiektów i wykonanie na nim konkretnych działań. Różne implementacje wizytatorów mogą wykonywać różne zadania, rozszerzając funkcjonalność struktury elementów bez ich wewnętrznej modyfikacji.
  
  Idea wzorca polega na stworzeniu interfejsu odwiedzającego (Visitor) zawierającego metody wirtualne Visit dla każdej z implementacji elementów (dziedziczących po klasie Element) w zadanej strukturze obiektów. Każdy odwiedzający jest "przyjmowany" przez dany element poprzez metodę Accept - dla poszczególnych implementacji obiektów Element, wołane są odpowiednie metody Visit w interfejsie Visitor odwiedzającego. Różne implementacje interfejsu Visitor mogą zawierać (hermetyzować) różne funkcjonalności dla całych struktur danych (składających się z obiektów Element). Obiekty tego typu reprezentują algorytmy wykonujące zadane czynności na każdym obiekcie osobno. Dla zbioru obiektów odwiedzanych metoda Accept powinna być wywoływana w odpowiedniej kolejności, gwarantując, iż każdy element zostanie odwiedzony w odpowiednim momencie. Przykładowo, wizytator odwiedzający węzły w drzewie powinien być akceptowany w kolejnych potomkach każdego z węzłów, zaś wizytator odwiedzający listę może być wołany kolejno dla poszczególnych elementów. 

------

### Obrazy


![alt text](images/GangOfFour-1.png)

![alt text](images/GangOfFour-2.png)

### UML

:warning: Zobacz [Gang of Four Design Patterns Reference Sheet](http://www.blackwasp.co.uk/GangOfFour.aspx)