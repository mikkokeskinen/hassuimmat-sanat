# hassuimmat-sanat

> KOODAUSPÄHKINÄ, HASSUIMMAT SANAT
> 
> Monet ulkomaalaiset pitävät suomen kieltä hassun kuuloisena vokaalien runsauden vuoksi. Erityisen hassulta kuulostaa, jos vokaaleja on monta peräkkäin, kuten kuuluisassa sanassa "hääyöaie", jossa on seitsemän peräkkäistä vokaalia.
> 
> Kehitämme tieteellisen tavan sanojen hassuuden pisteytykseen.
> 
> Jokainen vokaaliketju saa n×2n pistettä, jossa n on vokaalien määrä ketjussa. Sanan vokaaliketjujen saamat pisteet lasketaan yhteen, jolloin saadaan sanan hassuuspisteet.
> 
> Esimerkiksi sana "koira" saa 10 pistettä, koska "koira" sisältää vokaaliketjut "oi" (2×22 = 8 pistettä) ja "a" (1×21 = 2 pistettä), ja 8 + 2 = 10.
> 
> Sana "hääyöaie" saa 896 pistettä, koska vokaaliketju "ääyöaie" saa (7×27 = 896 pistettä).
> 
> Jotta hauskuus ei loppuisi kesken, käytämme esimerkkiteoksena Volter Kilven romaania Alastalon salissa, jota pidetään suomalaisen kirjallisuuden mestarinäytteenä hassuuden saralla.
> 
> Mikä on Alastalon salissa -romaanin hassuin sana, tai hassuimmat sanat, jos useampi sana saa korkeimmat hassuuspisteet?

[Source](http://wunderdog.fi/koodaus-hassuimmat-sanat/)

## Installation

Install [leiningen](http://leiningen.org/).

Run `lein install`

## Usage

    $ lein run
    
## Example

    $ lein run
    Hassuimmat sanat "puuaineen", "seremoniioilla", "liioittelematta", "leeaakaan", "niiaamaan", "seremoniioissa" saa 72 pistettä.
    $
    
## Run tests

    $ lein test

## License

Copyright © 2015 Mikko Keskinen <keso@iki.fi>

Distributed under the MIT License
