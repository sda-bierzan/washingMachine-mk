# washingMachine
# Zaprogramuj pralkę...

###...iteracyjnie

1. Interfejs pralki pozwala na jej załadowanie, uruchomienie, opróżnienie
    * pralka wyłącza się automatycznie
    * pralka kończy program po 10 sekundach
---
2. Do pralki można włożyć jedynie elementy które można wyprać - czyt. ograniczamy typ wkładanych elementów
---
3. Pralka ma maksymalną ładowność 9 kg, a to oznacza że:
    * nie możemy uruchomić pralki która przekroczyła dopuszczalną wagę
    * nie możemy dołożyć kolejnego elementu jeśli waga została przekroczona
    * interfejs pralki powinien umożliwić wyjęcie pojedynczego elementu
---
4. Pralkę uruchamiamy przy pomocy programu czasowego:
    * szybki - najkrótszy czas
    * standard - standardowy czas
    * eko - wydłużony czas
---
5. Dokładamy możliwość wyboru temperatury prania - 30/ 40/ 60 stopni. Wkładane elementy różnie reagują na temperaturę w zależności od materiału:
    * wełna - skurczy się powyżej 30 stopni
    * poliester - zniszczy się przy 60 stopniach
    * pozostałe nie reagują
      Po zakończeniu prania elementy zmieniają swój "stan" w zależności od reakcji na temperaturę
---
7. Dokładamy obroty: 400/ 600/ 800/ 1200/ 1400/ 1600. Analogicznie do temperatury niektóre produkty źle reagują na wyższe obroty
    * jedwab - zniszczenie przy obrotach od 1200
    * wełna, bawełna, jeans, frotte i inne grube materiały nie wypłukają się przy obrotach niższych niż 800
​
---
8. Decydujemy o rodzaju proszku do kolorowego prania/ do białego prania:
    * biały proszek + białe ciuchy - brak problemów
    * biały proszek + białe ciuchy + jeden kolorowy element - białe już nie są białe, a kolorowy jest wybielony
    * kolorowy proszek + kolorowe ciuchy + jeden biały element - biały już nie jest biały, a kolorowe jest wybielony
    * kolorowy proszek + kolorowe ciuchy - brak problemów
---
9. Program umożliwia dodanie suszenia:
    * przy wyborze prania z suszeniem, limit ładowności spada do 6 kg
    * elementy źle reagujące na temp. (pkt. 5) podobnie reagują na suzenie
---
10. Program umożliwia ustawienie, po jakim czasie uruchomi się pranie
