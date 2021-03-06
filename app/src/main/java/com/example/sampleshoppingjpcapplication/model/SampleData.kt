import android.location.Location
import com.example.sampleshoppingjpcapplication.R
import com.example.sampleshoppingjpcapplication.model.*

class SampleData {

    val types = listOf(
        Type("Fashion", R.drawable.fashion_image),
        Type("Mobiles", R.drawable.mobile_images),
        Type("Appliances", R.drawable.appliences_new),
        Type("Pantry", R.drawable.pantry),
        Type("Kitchen", R.drawable.kitchen)
    )


    val addresses = listOf(
        "Sinai Peninsula, Egypt",
        "Alajuela, Costa Rica",
        "Canton of Bern, Switzerland",
        "At 20-40% off",
        "At 20-30% off",
        "At 10% off",
        "Utah, United States",
        "At 60-80% off"
    )

    val descriptions = listOf(
        "Mount Sinai traditionally known as Jabal Musa, is a mountain in the Sinai Peninsula of Egypt that is a possible location of the biblical Mount Sinai, the place where Moses received the Ten Commandments.\n" +
                "\n" +
                "It is a 2,285-metre (7,497 ft) moderately high mountain near the city of Saint Catherine in the region known is modern times as the Sinai Peninsula. It is next to Mount Catherine (at 2,629 m or 8,625 ft, the highest peak in Egypt).[1] It is surrounded on all sides by higher peaks of the mountain range.",

        "The Poás Volcano, (Spanish: Volcán Poás), is an active 2,708-metre (8,885 ft) stratovolcano in central Costa Rica and is located within Poas Volcano National Park. It has erupted 40 times since 1828, including April 2017 when visitors and residents were evacuated.[2] The volcano and surrounding park were closed for nearly 17 months, with a 2.5 kilometer safety perimeter established around the erupting crater.[3] As of September 1, 2018 the park has reopened with limited access only to the crater observation area and requires a reservation to be made on the National Park Website. Adjacent trails to Lake Botos as well as the museum at the visitor center remained closed. The volcano erupted briefly twice in September 2019.",

        "The Eiger is a 3,967-metre (13,015 ft) mountain of the Bernese Alps, overlooking Grindelwald and Lauterbrunnen in the Bernese Oberland of Switzerland, just north of the main watershed and border with Valais. It is the easternmost peak of a ridge crest that extends across the Mönch to the Jungfrau at 4,158 m (13,642 ft), constituting one of the most emblematic sights of the Swiss Alps. While the northern side of the mountain rises more than 3,000 m (10,000 ft) above the two valleys of Grindelwald and Lauterbrunnen, the southern side faces the large glaciers of the Jungfrau-Aletsch area, the most glaciated region in the Alps. The most notable feature of the Eiger is its 1,800-metre-high (5,900 ft) north face of rock and ice, named Eiger-Nordwand, Eigerwand or just Nordwand, which is the biggest north face in the Alps.[3] This huge face towers over the resort of Kleine Scheidegg at its base, on the homonymous pass connecting the two valleys.",

        "Denali (/dɪˈnɑːli/)[5][6] (also known as Mount McKinley, its former official name)[7] is the highest mountain peak in North America, with a summit elevation of 20,310 feet (6,190 m) above sea level. With a topographic prominence of 20,156 feet (6,144 m) and a topographic isolation of 4,629 miles (7,450 km), Denali is the third most prominent and third most isolated peak on Earth, after Mount Everest and Aconcagua. Located in the Alaska Range in the interior of the U.S. state of Alaska, Denali is the centerpiece of Denali National Park and Preserve.",

        "Mount Fuji (富士山, Fujisan, IPA: [ɸɯꜜ(d)ʑisaɴ] (About this soundlisten)), located on the island of Honshū, is the highest mountain in Japan, standing 3,776.24 metres (12,389.2 ft). It is also the second-highest volcano located on an island in Asia (after Mount Kerinci on the island of Sumatra), and seventh-highest peak of an island on Earth.[1] Mount Fuji is an active stratovolcano that last erupted from 1707–1708.[4][5] The mountain stands about 100 kilometres (62 mi) south-west of Tokyo, and can be seen from there on clear days. Mount Fuji's exceptionally symmetrical cone, which is snow-capped for about 5 months a year, is commonly used as a cultural icon of Japan and it is frequently depicted in many arts and photographs, as well as visited by sightseers and climbers.",

        "The Inca Trail to Machu Picchu (also known as Camino Inca or Camino Inka) is a hiking trail in Peru that terminates at Machu Picchu. It consists of three overlapping trails: Mollepata, Classic, and One Day. Mollepata is the longest of the three routes with the highest mountain pass and intersects with the Classic route before crossing Warmiwañusqa (\"dead woman\"). Located in the Andes mountain range, the trail passes through several types of Andean environments including cloud forest and alpine tundra. Settlements, tunnels, and many Incan ruins are located along the trail before ending the terminus at the Sun Gate on Machu Picchu mountain. The two longer routes require an ascent to beyond 4,200 metres (13,800 ft) above sea level, which can result in altitude sickness.\n" +
                "\n" +
                "Concern about overuse leading to erosion has led the Peruvian government to place a limit on the number of people who may hike this trail per season, and to sharply limit the companies that can provide guides. As a result, advance booking is mandatory. A maximum of 500 people are allowed on the trail each day, of which only 200 are trekkers, the rest being guides and porters.[1] As a result, the high season books out very quickly.",

        "The Narrows is the narrowest section of Zion Canyon in Zion National Park, Utah, United States. Situated on the North Fork of the Virgin River and upstream of the main canyon, The Narrows is one of the premier hikes in the park and on the Colorado Plateau. The Narrows refers to both the 3.6-mile (5.8 km) bottom-up hike from the Temple of Sinawava to Big Springs, as well as the 16-mile (26 km) top-down hike from Chamberlain's Ranch back to the Temple of Sinawava.",

        "Annapurna is a massif in the Himalayas in north-central Nepal that includes one peak over 8,000 metres (26,000 ft), thirteen peaks over 7,000 metres (23,000 ft), and sixteen more over 6,000 metres (20,000 ft).[5] The massif is 55 kilometres (34 mi) long, and is bounded by the Kali Gandaki Gorge on the west, the Marshyangdi River on the north and east, and by Pokhara Valley on the south. At the western end, the massif encloses a high basin called the Annapurna Sanctuary. The highest peak of the massif, Annapurna I Main, is the tenth highest mountain in the world at 8,091 metres (26,545 ft) above sea level. Maurice Herzog led a French expedition to its summit through the north face in 1950, making it the first of the eight-thousanders to be climbed and the only 8,000 meter-peak to be conquered on the first try"
    )


    val ThankYou = Place(
        id = 8,
        name = "Thank You, India!\nHere's is how you madae it the\n biggest sale of the year",
        address = addresses[7],
        descriptions = descriptions[7],
        difficulty = 1,
        elevation = 8091,
        imageResources = listOf(
            R.drawable.sale_new,
            R.drawable.freestocks_1,
            R.drawable.annapurna_3,
            R.drawable.annapurna_4,
            R.drawable.annapurna_5,
            R.drawable.annapurna_6,
            R.drawable.annapurna_7,
            R.drawable.annapurna_8,
            R.drawable.annapurna_9
        ),
        feedBack = feedBack
    )


    val annapurna = Place(
        id = 8, name = "Annapurna", address = addresses[7],
        descriptions = descriptions[7],
        difficulty = 1,
        elevation = 8091,
        imageResources = listOf(
            R.drawable.jeans_image,
            R.drawable.annapurna_2,
            R.drawable.annapurna_3,
            R.drawable.annapurna_4,
            R.drawable.annapurna_5,
            R.drawable.annapurna_6,
            R.drawable.annapurna_7,
            R.drawable.annapurna_8,
            R.drawable.annapurna_9
        ),
        feedBack = feedBack
    )


    val mountFuji = Place(
        id = 5, name = "Mount Fuji", address = addresses[4],
        descriptions = descriptions[4],
        difficulty = 1,
        elevation = 3776,
        imageResources = listOf(
            R.drawable.shirts,
            R.drawable.mount_fuji_2,
            R.drawable.mount_fuji_3,
            R.drawable.mount_fuji_4,
            R.drawable.mount_fuji_5
        ),
        feedBack = feedBack
    )
    val denali = Place(
        id = 4, name = "Denali", address = addresses[3],
        descriptions = descriptions[3],
        difficulty = 1,
        elevation = 6190,
        imageResources = listOf(
            R.drawable.nike,
            R.drawable.denali_alaska_2,
            R.drawable.denali_alaska_3,
            R.drawable.denali_alaska_4,
            R.drawable.denali_alaska_5,
            R.drawable.denali_alaska_6
        ),
        feedBack = feedBack
    )
    val incaTrail = Place(
        id = 6, name = "Inca Trail", address = addresses[5],
        descriptions = descriptions[5],
        difficulty = 1,
        elevation = 2600,
        imageResources = listOf(
            R.drawable.cap_image,
            R.drawable.inca_trail_2,
            R.drawable.inca_trail_3,
            R.drawable.inca_trail_4,
            R.drawable.inca_trail_5
        ),
        feedBack = feedBack
    )
    val himalayaMountainRace = Event(12, "Tops & Dresses", R.drawable.top_dress, annapurna, 0)
    val mtFujiHillClimb = Event(12, "T-shirts & Shorts", R.drawable.tshirt, mountFuji, 0)
    val alaskaEnduranceTrailRun = Event(12, "Kids Wear", R.drawable.kids_dress, denali, 0)
    val incaTrailVirtualMarathon =
        Event(12, "Sports Shoes", R.drawable.shoes, incaTrail, 0)
    val upcomingEvents = listOf(
        himalayaMountainRace,
        mtFujiHillClimb,
        alaskaEnduranceTrailRun,
        incaTrailVirtualMarathon
    )


    val brands =
        listOf(
            denali,
            mountFuji,
            incaTrail,
            annapurna
        )


    val recommended =
        listOf(ThankYou)
}

val ratting = Ratting(
    count = 200,
    display = "200",
    value = 4.3,
    one = States(70),
    two = States(20),
    three = States(3),
    four = States(1),
    five = States(1)
)


val reviews = listOf(
    Review(
        text = "This was a very comfortable walk. The view was breathtaking. We marveled at the rock formations and the beauty of the creek running through the mountains..",
        date = "13 Nav 2019",
        ratting = 5f,
        user = User(1, "Sam Wright", icon = R.drawable.ic_profile),
        noOfReply = 7,
        likes = 30
    ),

    Review(
        text = "Beautiful scenery and views. It's hard on the knees going down. I suggest taking a lunch and starting from the closest bus stop, it's not a steep in this direction.",
        date = "13 Nav 2019",
        ratting = 5f,
        user = User(1, "Sam Wright", icon = R.drawable.ic_profile),
        noOfReply = 7,
        likes = 30
    ),

    Review(
        text = "  Good little work out. Hit the highest point in the trail with snow under foot. Couple of inches was all. The view from ther is great. You get to see the whole valley and ridge line all the way to Denali. The colors this time of year are amazing.",
        ratting = 5f,
        user = User(1, "Sam Wright", icon = R.drawable.ic_profile),
        noOfReply = 7,
        likes = 30,
        date = "13 Nav 2019"
    )
)

val feedBack =
    FeedBack(totalNoOfReview = 527, overallRatting = 4.3f, reviews = reviews, ratting = ratting)
