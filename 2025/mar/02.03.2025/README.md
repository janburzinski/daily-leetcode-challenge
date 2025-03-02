# Compare the Triplets

#### Rules:

a[i] < b[i] => b gets the point
a[i] == b[i] => no points
a[i] > b[i] => a gets the point

#### Vorgehensweise

- Wir allokieren einen int Array mit einer size von 2, da wir nur die Ergebnisse von 2 Personen speichern müssen
- Da beide Personen immer gleich viele Werte zum vergleichen haben, reicht es wenn man in der for loop bis zum `a_count` geht.
- Wir vergleichen dann einfach immer die Werte und vergeben die Punkte dann entsprechend
