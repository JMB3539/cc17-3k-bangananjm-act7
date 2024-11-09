package com.example.explorebaguiocity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _places = MutableLiveData<List<Place>>()
    val places: LiveData<List<Place>> get() = _places

    private val placeData = mapOf(

        "Parks" to listOf(
            Place("Burnham Park", R.drawable.burnham_park, "Parks",
                "Burnham Park is an open green park at the heart of Baguio. " +
                        "The park's lush greenery and blossoming blooms make you forget you're in the heart of a densely populated metropolis.",
                "Location: Jose Abad Santos Drive, Baguio City"),
            Place("Lion's Head", R.drawable.lion_head, "Parks",
                "The Lion's Head is a statue along Kennon Road, a major highway in Luzon, Philippines. " +
                        "Located in the Baguio–Tuba boundary, the Lion's Head measures 40 ft in height. ",
                "Location: Camp6, Kennon Road, Baguio City"),
            Place("Panagbenga Park", R.drawable.panagbenga_park, "Parks",
                "It's a quiet and small park I'd recommend people to visit in Baguio because they have a butterfly garden. " +
                        "They also have a small food/drink store so people can stay and chill here for a bit and be one with nature.",
                "South Drive, Baguio, Luzon, Philippines"),
            Place("Baguio Botanical Garden", R.drawable.botanical_garden, "Parks",
                "Botanical garden was part of the city's urban plan by American architect and urban planner, Daniel H. Burnham. " +
                        "The garden was intended to be a centerpiece that celebrated the region's flora while offering a place for relaxation and education.",
                "Location: 37 Leonard Wood Road, Baguio City"),
            Place("MinesView Park", R.drawable.mines_view_park, "Parks",
                "Mines View Park is an overlook park on the northeastern outskirts of Baguio in the Philippines. " +
                        "Located on a land promontory 4 kilometres (2.5 mi) from downtown Baguio, the park overlooks the mining town of Itogon, " +
                        "particularly the abandoned gold and copper mines of the Benguet Corporation, and offers a glimpse of the Amburayan Valley.",
                " Mines View Observation Deck, Mines View, Baguio, Benguet")
            ),

        "Malls" to listOf(
            Place("SM City Baguio", R.drawable.sm_baguio, "Malls",
                "It's location has the most amazing view, being at the highest altitude in the entire country. " +
                        "One can enjoy the mountain breeze blowing from all directions to the interiors of the mall itself. " +
                        "It was built with open-air railings so one can just loiter around while enjoying the view.",
                "Location: Luneta Hill, Upper Session Road, Baguio City, Benguet."),

            Place("Porta Vaga Mall", R.drawable.porta_vaga_mall, "Malls",
                "Porta Vaga Mall in Baguio offers themed buildings, a department store, food lane, and boutiques, focusing on social and environmental responsibility." +
                        "Compact mall complex with a variety of stores, a sizable eatery selection, a supermarket & services.",
                "Location: Upper Session Road, Baguio City, Benguet."),

            Place("Baguio Center Mall", R.drawable.baguio_center_mall, "Malls",
                "It is touted as one of the first modern-day malls to rise in Baguio City. Strategically situated just across the city’s forever-busy public market and near congested transport terminals, " +
                        "it enjoys an exceptionally high pedestrian traffic the whole day which naturally translates into an equally high customer count.",
                "Location: Magsaysay Ave, Baguio City, Benguet."),

            Place("Abanao Square", R.drawable.abanao_square, "Malls",
                "Abanao Square is a five-storey shopping mall nestled in the central business district of Baguio City. " +
                        "Offeringr a wide variety of shops and services for the ultimate shopping and dining experience.",
                "Location: Abanao corner Zandu Eta Street, Baguio City, Benguet."),

            Place("Maharlika Center", R.drawable.maharlika_center, "Malls",
                "The Maharlika Livelihood Center stands on the former site of the Baguio Stone Market, " +
                        "which was gutted by a major fire in 1970 and was demolished in the mid-1970s.[2] In 1972, the Baguio city council leased the property to MAR-BAY and Co. Inc., " +
                        "which was given the right to build and manage the Maharlika Livelihood Center for 25 years.",
                "Location: Maharlika, Baguio City, Benguet.")
        ),

        "Museums" to listOf(
            Place("Baguio Museum", R.drawable.baguio_museum, "Museums",
                "Baguio Museum is another gallery dedicated to the preservation of the city’s cultural heritage." +
                        "Inside, you’ll find intricate dioramas, tribal artifacts, and other items showcasing the life of the various indigenous groups that call the Cordillera Region home.",
                "Location: Dot-PTA Complex, Gov. Pack Rd, Baguio, 2600 Benguet"),

            Place("Bencab Museum", R.drawable.bencab_museum, "Museums",
                "A visit to Baguio would not be complete without a stop at the BenCab Museum located in Tuba, Benguet. " +
                        "It is owned and named after National Artist Benedicto Cabrera, " +
                        "whose mastery ranges from painting to printmaking and beyond.",
                "Location: Km. 6 Asin Road, Tadiangan, Tuba, Benguet, Philippines"),

            Place("Museo Kordilyera", R.drawable.museu_kordilyera, "Museums",
                "Museo Kordilyera is located inside the University of the Philippines Baguio, " +
                        "has three floors full of artwork and artifacts, as well as a cafe and a small souvenir shop open to all guests. " +
                        "It includes items from the Kalingas, Bontocs, and Ifugaos, among others.",
                "Location: 30 Gov. Pack Rd, Baguio, 2602 Benguet"),

            Place("Bell House Library Museum", R.drawable.bell_house, "Museums",
                "The Bell House Library Museum may not be your usual museum in Baguio, but it’s still worth checking out. " +
                        "The unique attraction inside Camp John Hay was designed by General J. Franklin Bell and was used as a rest house by the Commanding General of the Philippines. " +
                        "Art and architecture aficionados will be impressed by its American-style design and its cozy interiors.",
                "Location: Bell House, Camp John Hay, Baguio, Benguet."),

            Place("Tam-awan Village", R.drawable.tamawan_village, "Museums",
                "MTam-Awan Village is a one-of-a-kind creative community located in Pinsao Proper. " +
                        "It aims to promote the rich heritage of the Cordilleran people and, at the same time, showcase the works of local artists. ",
                "Location: 367 Long Long Benguet Rd, Baguio, Benguet.")
        ),

        "Restaurants" to listOf(
            Place("Good Taste", R.drawable.good_taste, "Restaurants",
                "Diner Catering experience of both Filipino and Chinese cuisine fusion that will cater to huge groups of people, families, and the public at an affordable price.",
                "Location: Otek Street Rizal Monument Barangay, Baguio, Luzon 2600 Philippines"),
            Place("Katipunan", R.drawable.katipunan, "Restaurants",
                "The place to go to get a taste of one of the best pinuneg in town. Pingping (beef cheek) and Tinuno (pork) are also must try",
                "Location: Katipunan Inn and Restaurant, Kalantiao Street, Baguio, 2600 Benguet"),
            Place("Grumpy Joe", R.drawable.grumpy_joe, "Restaurants",
                "All American Pizza, Pasta, Burger & Chicken Restaurant. Also serves coffee, tea & variety of cold drinks.",
                "Location: 299 Upper Session Rd, Baguio, Benguet"),
            Place("Pyesta Diner", R.drawable.pyesta_diner, "Restaurants",
                "Traditional Filipino food.  Wide variety of options available both for food and drink.  Combination meals available. ",
                "Location: Pyesta Diner, 225 Upper Session Road, DPS Compound Access Road, Baguio, 2600 Benguet"),
            Place("Ili-Likha Artists Village", R.drawable.ili_likha, "Restaurants",
                "If you are looking for a rare gem in  Baguio,  Ili-Likha Artist Village is a must-visit for you. " +
                        "Not only will it satisfy your soulful cravings thru appreciation of artistry. " +
                        "It will also quench your palatable thirst for a great yet relatively affordable dishes. Plus, " +
                        "you'll get a bit sense of altruism by supporting less-known businesses here in Ili-Likha.",
                "Location: Assumption, Baguio, Luzon 2600 Philippines")
        ),

        "Night Entertainment" to listOf(
            Place("Lock Down Bar", R.drawable.lockdown_bar, "Club and Bar",
                "This bar offers you nice food and a place to rest after a long walk around Burnham Park. " +
                        "The positive aspect of Lockdown Bar is that the staff is efficient. Fast service is something visitors agree upon here. " +
                        "When you enter this place, you notice the lovely atmosphere. ",
                "Location: 2 M.H. Del Pilar St, Baguio, Cordillera Administrative Region, Philippines"),
            Place("Concoqtions Bar Baguio", R.drawable.concoqtions, "Club and Bar",
                "Concoctions Bar & Resto is notable for its cool service. " +
                        "The calm atmosphere will be really just what you need after a hard working week. " +
                        "This place has received Google 4 according to the visitors' opinions.",
                "Location:  #86 Upper General Luna Road, Baguio City, Philippines"),
            Place("The Camp", R.drawable.the_camp, "Club and Bar",
                "Experience The Camp Baguio, Baguio's iconic nightlife destination. " +
                        "Explore The Camp for electrifying nights, Here Gastropub for casual bites, and Hardin Resto Cafe for a garden escape. " +
                        "Discover your favorite spot, day or night.",
                "110 Brgy Teachers Camp Rd, Baguio, 2600 Benguet."),
            Place("Hardin", R.drawable.hardin, "Club and Bar",
                "Experience Baguio city's cool night ambiance with our one of a kind garden outdoor seating. " +
                        "Chill with friends and relatives as the nightly live band serenades you.",
                "Location: 7 Loakan Rd, Baguio City, Benguet."),
            Place("City Lights", R.drawable.city_lights, "Club and Bar",
                "Citylight Hotel is a reflection of Baguio's metropolitan and environmental resplendence, a fresh, modern hotel that features a clean, minimalist, " +
                        "geometric architectural design with a chic Zen interior perfect for setting the mood to ultimate relaxation. ",
                "Location: 46 Upper Session Rd, Baguio City, Benguet."),
        )
    )

    fun loadPlaces(category: String) {
        _places.value = placeData[category] ?: emptyList()
    }
}