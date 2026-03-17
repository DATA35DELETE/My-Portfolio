package database.company.myportfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import database.company.myportfolio.ui.theme.MyPortfolioTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyPortfolioTheme(darkTheme = false) {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(Modifier
                        .padding(innerPadding)
                        .background(Color(0))
                        .verticalScroll(rememberScrollState())){
                        dataName(modifier = Modifier.padding(innerPadding))
                        dataSurname(modifier = Modifier.padding(innerPadding))

                        dataStory(modifier = Modifier.padding(innerPadding))

                        createImageData(modifier = Modifier.padding(innerPadding))

                        myDonePart1(modifier = Modifier.padding(innerPadding))

                        myDonePart2(modifier = Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }
}

@Composable
fun dataName(modifier: Modifier = Modifier) {
    Text(
        text = "Ad: ",
        color = Color.White,
        modifier = modifier
            .absoluteOffset(10.dp, 150.dp)
            //.background(Color.Red)
            .size(240.dp, 30.dp),
        fontWeight = FontWeight.Black,
        fontSize = 20.sp
    )

    Text(
        text = "Muhammet Enes",
        color = Color.White,
        modifier = modifier
            .padding(50.dp, 150.dp)
            //.background(Color.Red)
            .size(260.dp, 30.dp),
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
}
@Composable
fun dataSurname(modifier: Modifier = Modifier) {
    Text(
        text = "Soyad: ",
        color = Color.White,
        modifier = modifier
            .padding(10.dp, 180.dp)
            //.background(Color.Red)
            .size(70.dp, 30.dp),
        fontWeight = FontWeight.Black,
        fontSize = 20.sp
    )

    Text(
        text = "Karaboğa",
        color = Color.White,
        modifier = modifier
            .padding(85.dp, 180.dp)
            //.background(Color.Red)
            .size(170.dp, 30.dp),
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
}

@Composable
fun dataStory(modifier: Modifier = Modifier) {
    Text(
        text = "Hikayem",
        color = Color.White,
        modifier = modifier
            .padding(0.dp, 225.dp)
            //.background(Color.Red)
            .size(420.dp, 30.dp),
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Black,
        fontSize = 20.sp
    )

    Text(
        text = "    Tarihler 2010 Eylül 5'i gösterdiğinde İzmir'in Buca ilçesinde doğmuşum. Yazılım ile tanışmam ve bu işlere başlamamın tarihi ise 2020 yıllarında belimde tümör çıkmasıyla, bir merakla başladı... O zamanlar tek eğlence kaynağım olan ve 20 yıllını devirmiş bir bilgisayar vardı. O bilgisayarda ilk kodlarımı yazdım. Tabi aradan yıllar geçti. İyileşmiştim ama yazılıma tutkum hiç bir zaman bitmemişti. Ben inanıyorum ki hiç bir zamanda bitmeyecek!",
        color = Color.White,
        modifier = modifier
            .padding(10.dp, 255.dp)
            //.background(Color.Red)
            .size(400.dp, 400.dp),
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    )
}

@Composable
fun createImageData(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.workanddata),
        contentDescription = "Data",
        modifier = modifier
            .size(150.dp)
            .absoluteOffset(10.dp,0.dp)
            .clip(CircleShape)
    )
}

@Composable
fun myDonePart1(modifier: Modifier){
    Text(
        text = "Yaptıklarım",
        color = Color.White,
        modifier = modifier
            .padding(0.dp, 525.dp)
            //.background(Color.Red)
            .size(420.dp, 30.dp),
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Black,
        fontSize = 25.sp
    )

    Text(
        text = "Öğrendiğim Diller",
        color = Color.White,
        modifier = modifier
            .padding(10.dp, 565.dp)
            //.background(Color.Red)
            .size(200.dp, 30.dp),
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )

    Text(
        text = "    10 yaşımdan bu yana sürekli kendimi geliştirdiğimden, bir çok dili deneme ve kullanma fırsatım oldu. Başta Lua olmak üzere, Python, Java, C#, Rust ve HTML/CSS/JS gibi dilleri öğrendim. Aralarında C# ve Rust üzerine yoğunlaştım. Ancak diğer dillerede sorun olmadan adapte olabilirim.",
        color = Color.White,
        modifier = modifier
            .padding(10.dp, 595.dp)
            //.background(Color.Red)
            .size(400.dp, 400.dp),
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    )

    Image(
        painter = painterResource(id = R.drawable.java_ico),
        contentDescription = "Java",
        modifier = modifier
            .size(150.dp)
            .absoluteOffset(10.dp, 770.dp)
            .rotate(10f)
    )

    Image(
        painter = painterResource(id = R.drawable.rust_ico),
        contentDescription = "Rust",
        modifier = modifier
            .size(150.dp)
            .absoluteOffset(170.dp, 770.dp)
            .rotate(-10f)
    )

    Text(
        text = "Ortaokul Boyunca Yaptıklarım",
        color = Color.White,
        modifier = modifier
            .padding(10.dp, 965.dp)
            //.background(Color.Red)
            .size(450.dp, 30.dp),
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )

    Text(
        text = "    Ortaokul boyunca resmiyete geçecek pek bir şey yapmadım. Bu zamanlarda genelde dil öğrenmeye ve proje geliştirmeye çalıştım. Ayrıca ilk Unity'den yapılmış oynum olan \"Data Platformer\" oynumu itch.io sitesinde yayımladım. Bu süreçte yeni bilgiler ve deneyimler edindim",
        color = Color.White,
        modifier = modifier
            .padding(10.dp, 995.dp)
            //.background(Color.Red)
            .size(400.dp, 400.dp),
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    )

    Image(
        painter = painterResource(id = R.drawable.itchio),
        contentDescription = "Java",
        modifier = modifier
            .size(150.dp)
            .absoluteOffset(100.dp, 1140.dp)
            .rotate(-5f)
    )

    Text(
        text = "Lise Başlangıcı",
        color = Color.White,
        modifier = modifier
            .padding(10.dp, 1300.dp)
            //.background(Color.Red)
            .size(200.dp, 30.dp),
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )

    Text(
        text = "    Liseye başladığım sıralarda bir Github hesabı açtım ve ilk projelerimi bu hesaptan açık kaynak olucak şeklinde yayımladım.\n" +
                "\n" +
                "   Bu sıralarda TÜBİTAK 2209 A Bölge Yarışmasına seçilicek olan \"Umay\" o zamanki adıyla \"The Communication\", ilk tohumlarını ve kodlarını yazdım. İlk sürümü sunucu ve Java tabanlı olsada ileride P2P sistemini benimsicek ve çekirdek kod kodlarını Rust dili ile yeniden yazıcaktım.\n" +
                "\n" +
                "   İlk yarışmam olan Gameathon 4.0 yarışmasına 9. sınıf iken katıldım. 24 saat boyunca bilgisayar başında kod yazdım ve sonucunda 4. oldum.\n" +
                "\n" +
                "   Ardından ilk defa TÜBİTAK 2209 A yarışmasına katıldım ancak yazdığım proje red edildi.\n" +
                "\n" +
                "   Hocalarımın teşvikleri ile Milli Eğitimin Bakanlığı tarafından düzenlenen ve \"Değerler Eğitimi\" adı kapsamında ilkokul öğrencilere değer eğitimi için, arkadaşım Mert Efe ile bir Web tabanlı sunu tasarladık. Projemiz çok beğenildi ve ödüllendirildi.\n" +
                "\n" +
                "   Lisenin 9. sınıf bitimine doğru ise TEKNOİZ Yapay Zekâ ve Robot Yarışması'nda hakem yardımcısı olarak görev aldım.\n" +
                "\n" +
                "   Lisenin başlangıcında, yazdığım proje olan \"Umay\" projesini 10. sınıfın ilk yarısında TÜBİTAK 2209 A'ya başvurumu yaptım. Projem ön değerlendirme ve değerlendime süreçlerinde 92.338 puan ile bölge yarışmasına katılmaya hak kazandı. 4 gün boyunca gerek bölge sergisine gelen misafirlere gerek jüri üyelerine projemi sundum. Sunduğum kişilerin nerdeyse tamamı projeme bayıldıklarını ifade ettiler. Hatta sunduğum 10-11 misafir ise projemi indirip kullanıcağını söylediler.\n" +
                "\n" +
                "   Ardından hocalarımın teşvikleri ile arkadaşım Mert Efe ile okulumuz Göztepe Mesleki ve Teknik Anadolu Lisesi Bilişim Teknolojileri öğrencileri olarak, eli öpülesi velilerimize, Maarif Modelin \"Aile\" temasındaki \"Dijital Risk ve Tehditlerin Aile Kurumuna Etkisi\" alt temayı seçip, \"Yapay Zeka ve Sosyal Medyanın Avantajları & Dezavantajları\" temalı bir sunu tasarladık. 9 Mart saat 11.45 gibi sunumumuzu 22 veli önünde yapmış olduk. Sunumumuzun çok beğenildiğine dair bir çok geri dönüş aldık. Bu süreçte bir çok araç ve yetenek edindim.",
        color = Color.White,
        modifier = modifier
            .padding(10.dp, 1330.dp)
            //.background(Color.Red)
            .size(400.dp, 1280.dp),
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    )
}

@Composable
fun myDonePart2(modifier: Modifier)
{
    Image(
        painter = painterResource(id = R.drawable.ic_chat_bubble_foreground),
        contentDescription = "Umay",
        modifier = modifier
            .size(150.dp)
            .absoluteOffset(10.dp, 2600.dp)
            .rotate(9f)
    )

    Image(
        painter = painterResource(id = R.drawable.gameathon_belge),
        contentDescription = "Gameathon Belgesi",
        modifier = modifier
            .size(200.dp, 150.dp)
            .absoluteOffset(150.dp, 2700.dp)
            .rotate(-7f)
    )

    Image(
        painter = painterResource(id = R.drawable.tubitak_logo),
        contentDescription = "Tübitak Logo",
        modifier = modifier
            .size(150.dp)
            .absoluteOffset(10.dp, 2850.dp)
            .rotate(0f)
    )

    Image(
        painter = painterResource(id = R.drawable.meb_projesi),
        contentDescription = "Meb Projesi",
        modifier = modifier
            .size(200.dp, 150.dp)
            .absoluteOffset(150.dp, 2900.dp)
            .rotate(2f)
    )

    Image(
        painter = painterResource(id = R.drawable.teknoiz),
        contentDescription = "Tübitak Logo",
        modifier = modifier
            .size(200.dp, 150.dp)
            .absoluteOffset(5.dp, 3050.dp)
            .rotate(-6f)
    )

    Image(
        painter = painterResource(id = R.drawable.bolge_sergisi_1),
        contentDescription = "Bölge Sergisi 1",
        modifier = modifier
            .size(200.dp, 150.dp)
            .absoluteOffset(180.dp, 3100.dp)
            .rotate(3f)
    )

    Image(
        painter = painterResource(id = R.drawable.bolge_sergisi_2),
        contentDescription = "Bölge Sergisi 2",
        modifier = modifier
            .size(200.dp, 150.dp)
            .absoluteOffset(5.dp, 3250.dp)
            .rotate(-1f)
    )

    Image(
        painter = painterResource(id = R.drawable.sunum),
        contentDescription = "Sunum",
        modifier = modifier
            .size(300.dp, 200.dp)
            .absoluteOffset(110.dp, 3350.dp)
            .rotate(-3f)
    )
}