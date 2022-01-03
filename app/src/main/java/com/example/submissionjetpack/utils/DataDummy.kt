package com.example.submissionjetpack.utils

import com.example.submissionjetpack.R
import com.example.submissionjetpack.data.StudioEntity

object DataDummy {

    fun generateDummyMovie(): ArrayList<StudioEntity> {

        val movie = ArrayList<StudioEntity>()

        movie.add(
            StudioEntity(
        "Bohemian Rhapsody",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            "10/30/2018",
            "Music, Drama, History",
            8.0,
            R.drawable.poster_bohemian)
        )
        movie.add(
            StudioEntity(
                "Cold Persunit",
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                "02/08/2019",
                "Action, Crime, Thriller",
                5.7,
                R.drawable.poster_cold_persuit)
        )
        movie.add(
            StudioEntity(
                "Creed II",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.on of his late friend and former rival Apollo Creed.",
                "11/21/2018",
                "Drama",
                6.9,
                R.drawable.poster_creed)
        )
        movie.add(
            StudioEntity(
                "Fantastic Beasts: The Crimes of Grindelwald",
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.\n",
                "11/16/2018",
                "Adventure, Fantasy, Drama",
                6.9,
                R.drawable.poster_crimes)
        )
        movie.add(
            StudioEntity(
                "Glass",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.\n",
                "01/18/2019",
                "Thriller, Drama, science Fiction",
                6.7,
                R.drawable.poster_glass)
        )
        movie.add(
            StudioEntity(
                "Mary Queen of Scots",
                "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.\n",
                "12/21/2018",
                "Drama, History",
                6.6,
                R.drawable.poster_marry_queen)
        )
        movie.add(
            StudioEntity(
                "Mortal Engines",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.\n",
                "12/14/2018",
                "Adventure, Science Fiction",
                6.2,
                R.drawable.poster_mortal_engines)
        )
        movie.add(
            StudioEntity(
                "Overlord",
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.\n",
                "11/09/2018",
                "Horror, War, Science Ficition",
                6.7,
                R.drawable.poster_overlord)
        )
        movie.add(
            StudioEntity(
                "Robin Hood",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.\n",
                "11/21/2018",
                "Adventure, Action, Thriller",
                5.9,
                R.drawable.poster_robin_hood)
        )
        movie.add(
            StudioEntity(
                "T34",
                "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.\n",
                "01/01/2019",
                "War, Action, Drama, History",
                7.0,
                R.drawable.poster_t34)
        )

        return movie
    }

    fun generateDummyTv(): ArrayList<StudioEntity> {

        val tvSeries = ArrayList<StudioEntity>()

        tvSeries.add(
            StudioEntity(
                "Arrow",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "2012",
                "Crime, Drama, Mystery, Action & Adventure",
                6.7,
                R.drawable.tvposter_arrow)
        )
        tvSeries.add(
            StudioEntity(
                "Doom Patrol",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "2019",
                "Sci-Fi & Fantasy, Drama",
                7.7,
                R.drawable.tvposter_doom_patrol)
        )
        tvSeries.add(
            StudioEntity(
                "Family Guy",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "1999",
                "Animation, Comedy",
                7.1,
                R.drawable.tvposter_family_guy)
        )
        tvSeries.add(
            StudioEntity(
                "Game of Thrones",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "2011",
                "Sci-Fi & Fantasy, Drama, Action & Adventure",
                8.4,
                R.drawable.tvposter_god)
        )
        tvSeries.add(
            StudioEntity(
                "Gotham",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "2014",
                "Drama, Crime, Sci-Fi & Fantasy",
                7.6,
                R.drawable.tvposter_gotham)
        )
        tvSeries.add(
            StudioEntity(
                "Marvel's Iron Fist",
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                "2017",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                6.6,
                R.drawable.tvposter_iron_fist)
        )
        tvSeries.add(
            StudioEntity(
                "Supergirl",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "2015",
                "Drama, Sci-Fi & Fantasy, Action & Adventure",
                7.3,
                R.drawable.tvposter_supergirl)
        )
        tvSeries.add(
            StudioEntity(
                "Supernatural",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "2005",
                "Drama, Mystery, Sci-Fi & Fantasy",
                8.2,
                R.drawable.tvposter_supernatural)
        )
        tvSeries.add(
            StudioEntity(
                "The Simpsons",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "1989",
                "Family, Animation, Comedy",
                7.9,
                R.drawable.tvposter_the_simpson)
        )
        tvSeries.add(
            StudioEntity(
                "The Walking Dead",
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "2010",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                8.1,
                R.drawable.tvposter_the_walking_dead)
        )
        return tvSeries
    }
}