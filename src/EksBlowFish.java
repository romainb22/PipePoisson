public class EksBlowFish extends BlowFish{
    private static final String pi =
            "3141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359408128481117450284102701938521105559644622948954930381964" +
            "42881097566593344612847564823378678316527120190914564856692346034861045432664821339360726024914127372458700660631558817488152092096282925409171536436789259036001133053054882046652138414695194151160943305727" +
            "03657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452" +
            "63560827785771342757789609173637178721468440901224953430146549585371050792279689258923542019956112129021960864034418159813629774771309960518707211349999998372978049951059731732816096318595024459455346908302" +
            "64252230825334468503526193118817101000313783875288658753320838142061717766914730359825349042875546873115956286388235378759375195778185778053217122680661300192787661119590921642019893809525720106548586327886" +
            "59361533818279682303019520353018529689957736225994138912497217752834791315155748572424541506959508295331168617278558890750983817546374649393192550604009277016711390098488240128583616035637076601047101819429" +
            "55596198946767837449448255379774726847104047534646208046684259069491293313677028989152104752162056966024058038150193511253382430035587640247496473263914199272604269922796782354781636009341721641219924586315" +
            "03028618297455570674983850549458858692699569092721079750930295532116534498720275596023648066549911988183479775356636980742654252786255181841757467289097777279380008164706001614524919217321721477235014144197" +
            "35685481613611573525521334757418494684385233239073941433345477624168625189835694855620992192221842725502542568876717904946016534668049886272327917860857843838279679766814541009538837863609506800642251252051" +
            "17392984896084128488626945604241965285022210661186306744278622039194945047123713786960956364371917287467764657573962413890865832645995813390478027590099465764078951269468398352595709825822620522489407726719" +
            "47826848260147699090264013639443745530506820349625245174939965143142980919065925093722169646151570985838741059788595977297549893016175392846813826868386894277415599185592524595395943104997252468084598727364" +
            "46958486538367362226260991246080512438843904512441365497627807977156914359977001296160894416948685558484063534220722258284886481584560285060168427394522674676788952521385225499546667278239864565961163548862" +
            "30577456498035593634568174324112515076069479451096596094025228879710893145669136867228748940560101503308617928680920874760917824938589009714909675985261365549781893129784821682998948722658804857564014270477" +
            "55513237964145152374623436454285844479526586782105114135473573952311342716610213596953623144295248493718711014576540359027993440374200731057853906219838744780847848968332144571386875194350643021845319104848" +
            "10053706146806749192781911979399520614196634287544406437451237181921799983910159195618146751426912397489409071864942319615679452080951465502252316038819301420937621378559566389377870830390697920773467221825" +
            "62599661501421503068038447734549202605414665925201497442850732518666002132434088190710486331734649651453905796268561005508106658796998163574736384052571459102897064140110971206280439039759515677157700420337" +
            "86993600723055876317635942187312514712053292819182618612586732157919841484882916447060957527069572209175671167229109816909152801735067127485832228718352093539657251210835791513698820914442100675103346711031" +
            "41267111369908658516398315019701651511685171437657618351556508849099898599823873455283316355076479185358932261854896321329330898570642046752590709154814165498594616371802709819943099244889575712828905923233" +
            "26097299712084433573265489382391193259746366730583604142813883032038249037589852437441702913276561809377344403070746921120191302033038019762110110044929321516084244485963766983895228684783123552658213144957" +
            "68572624334418930396864262434107732269780280731891544110104468232527162010526522721116603966655730925471105578537634668206531098965269186205647693125705863566201855810072936065987648611791045334885034611365" +
            "76867532494416680396265797877185560845529654126654085306143444318586769751456614068007002378776591344017127494704205622305389945613140711270004078547332699390814546646458807972708266830634328587856983052358" +
            "08933065757406795457163775254202114955761581400250126228594130216471550979259230990796547376125517656751357517829666454779174501129961489030463994713296210734043751895735961458901938971311179042978285647503" +
            "20319869151402870808599048010941214722131794764777262241425485454033215718530614228813758504306332175182979866223717215916077166925474873898665494945011465406284336639379003976926567214638530673609657120918" +
            "07638327166416274888800786925602902284721040317211860820419000422966171196377921337575114959501566049631862947265473642523081770367515906735023507283540567040386743513622224771589150495309844489333096340878" +
            "07693259939780541934144737744184263129860809988868741326047215695162396586457302163159819319516735381297416772947867242292465436680098067692823828068996400482435403701416314965897940924323789690706977942236" +
            "25082216889573837986230015937764716512289357860158816175578297352334460428151262720373431465319777741603199066554187639792933441952154134189948544473456738316249934191318148092777710386387734317720754565453" +
            "22077709212019051660962804909263601975988281613323166636528619326686336062735676303544776280350450777235547105859548702790814356240145171806246436267945612753181340783303362542327839449753824372058353114771" +
            "19926063813346776879695970309833913077109870408591337464144282277263465947047458784778720192771528073176790770715721344473060570073349243693113835049316312840425121925651798069411352801314701304781643788518" +
            "52909285452011658393419656213491434159562586586557055269049652098580338507224264829397285847831630577775606888764462482468579260395352773480304802900587607582510474709164396136267604492562742042083208566119" +
            "06254543372131535958450687724602901618766795240616342522577195429162991930645537799140373404328752628889639958794757291746426357455254079091451357111369410911939325191076020825202618798531887705842972591677" +
            "81314969900901921169717372784768472686084900337702424291651300500516832336435038951702989392233451722013812806965011784408745196012122859937162313017114448464090389064495444006198690754851602632750529834918" +
            "74078668088183385102283345085048608250393021332197155184306354550076682829493041377655279397517546139539846833936383047461199665385815384205685338621867252334028308711232827892125077126294632295639898989358" +
            "21167456270102183564622013496715188190973038119800497340723961036854066431939509790190699639552453005450580685501956730229219139339185680344903982059551002263535361920419947455385938102343955449597783779023" +
            "74216172711172364343543947822181852862408514006660443325888569867054315470696574745855033232334210730154594051655379068662733379958511562578432298827372319898757141595781119635833005940873068121602876496286" +
            "74460477464915995054973742562690104903778198683593814657412680492564879855614537234786733039046883834363465537949864192705638729317487233208376011230299113679386270894387993620162951541337142489283072201269" +
            "01475466847653576164773794675200490757155527819653621323926406160136358155907422020203187277605277219005561484255518792530343513984425322341576233610642506390497500865627109535919465897514131034822769306247" +
            "43536325691607815478181152843667957061108615331504452127473924544945423682886061340841486377670096120715124914043027253860764823634143346235189757664521641376796903149501910857598442391986291642193994907236" +
            "23464684411739403265918404437805133389452574239950829659122850855582157250310712570126683024029295252201187267675622041542051618416348475651699981161410100299607838690929160302884002691041407928862150784245" +
            "16709087000699282120660418371806535567252532567532861291042487761825829765157959847035622262934860034158722980534989650226291748788202734209222245339856264766914905562842503912757710284027998066365825488926" +
            "48802545661017296702664076559042909945681506526530537182941270336931378517860904070866711496558343434769338578171138645587367812301458768712660348913909562009939361031029161615288138437909904231747336394804" +
            "57593149314052976347574811935670911013775172100803155902485309066920376719220332290943346768514221447737939375170344366199104033751117354719185504644902636551281622882446257591633303910722538374218214088350" +
            "86573917715096828874782656995995744906617583441375223970968340800535598491754173818839994469748676265516582765848358845314277568790029095170283529716344562129640435231176006651012412006597558512761785838292" +
            "04197484423608007193045761893234922927965019875187212726750798125547095890455635792122103334669749923563025494780249011419521238281530911407907386025152274299581807247162591668545133312394804947079119153267" +
            "34302824418604142636395480004480026704962482017928964766975831832713142517029692348896276684403232609275249603579964692565049368183609003238092934595889706953653494060340216654437558900456328822505452556405" +
            "64482465151875471196218443965825337543885690941130315095261793780029741207665147939425902989695946995565761218656196733786236256125216320862869222103274889218654364802296780705765615144632046927906821207388" +
            "37781423356282360896320806822246801224826117718589638140918390367367222088832151375560037279839400415297002878307667094447456013455641725437090697939612257142989467154357846878861444581231459357198492252847" +
            "16050492212424701412147805734551050080190869960330276347870810817545011930714122339086639383395294257869050764310063835198343893415961318543475464955697810382930971646514384070070736041123735998434522516105" +
            "07027056235266012764848308407611830130527932054274628654036036745328651057065874882256981579367897669742205750596834408697350201410206723585020072452256326513410559240190274216248439140359989535394590944070" +
            "46912091409387001264560016237428802109276457931065792295524988727584610126483699989225695968815920560010165525637567";

    private static byte[][] genParray(){
        Main.logger.log("Generating P arrays");
        byte[][] pArray = new byte[18][4];
        int charIndex = 0;
        char c;
        int parsedInt;
        for(int i = 0; i < 18; i++) {
            c = pi.charAt(charIndex++);
            parsedInt = Integer.parseInt(String.valueOf(c));
            pArray[i][0] = (byte) (parsedInt & 0xFF000000);
            pArray[i][1] = (byte) (parsedInt & 0x00FF0000);
            pArray[i][2] = (byte) (parsedInt & 0x0000FF00);
            pArray[i][3] = (byte) (parsedInt & 0x000000FF);
        }
        Main.logger.log("Done");
        return pArray;
    }

    private static byte[][][] genSBoxes() {
        Main.logger.log("Generating SBoxes");
        byte[][][] sBoxes = new byte[4][256][4];
        int charIndex = 18*4;
        char c;
        int parsedInt;
        for(int i =0;i<sBoxes.length;i++){
            for(int j = 0;j<sBoxes[i].length;j++)
            {
                c = pi.charAt(charIndex++);
                parsedInt = Integer.parseInt(String.valueOf(c));
                sBoxes[i][j][0] = (byte) (parsedInt & 0xFF000000);
                sBoxes[i][j][1] = (byte) (parsedInt & 0x00FF0000);
                sBoxes[i][j][2] = (byte) (parsedInt & 0x0000FF00);
                sBoxes[i][j][3] = (byte) (parsedInt & 0x000000FF);
            }
        }
        Main.logger.log("Done");
        return sBoxes;
    }

    public EksBlowFish(long cost, byte[] salt,byte[] key){
        super(genSBoxes(),genParray());
        if(salt.length != 16) {
            throw new IllegalArgumentException("salt must be 16 bytes ("+salt.length+" given)");
        }
        byte[] salt0 = new byte[16];
        expandKey(salt,key);
        for(long i = 0; i < Math.pow(2,cost); i++) {
            expandKey(salt0, salt);
            expandKey(salt0, key);
        }
    }
    private void expandKey(byte[] salt, byte[] key) {
        if(salt.length != 16) {
            throw new IllegalArgumentException("salt must be 16 bytes");
        }
        for(byte[] bytes : pArray) {
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] ^= key[i % key.length];
            }
        }
        byte[] saltLeft = new byte[8];
        byte[] saltRight = new byte[8];
        System.arraycopy(salt, 0, saltLeft, 0, 8);
        System.arraycopy(salt, 8, saltRight, 0, 8);

        //On divise en deux le salt
        for(int i = 0; i < 3;i += 6){
            byte[] saltLeftEnc = blow(saltLeft);
            byte[] XOR = xor(saltLeftEnc, saltRight);
            byte[] XorEnc = blow(XOR);
            byte[] XOR2 = xor(XorEnc, saltLeftEnc);
            byte[] XorEnc2 = blow(XOR2);
            System.arraycopy(saltLeftEnc, 0, pArray[i], 0, 4);
            System.arraycopy(saltLeftEnc, 4, pArray[i+1], 0, 4);
            System.arraycopy(XorEnc, 0, pArray[i+2], 0, 4);
            System.arraycopy(XorEnc, 4, pArray[i+3], 0, 4);
            System.arraycopy(XorEnc2, 0, pArray[i+4], 0, 4);
            System.arraycopy(XorEnc2, 4, pArray[i+5], 0, 4);
            byte[] temp = saltLeft;
            saltLeft = saltRight;
            saltRight = temp;
        }
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 127; j += 2) {
                byte[] saltLeftEnc = blow(saltLeft);
                byte[] XOR = xor(saltLeftEnc, saltRight);
                byte[] XorEnc = blow(XOR);
                byte[] XOR2 = xor(XorEnc, saltLeftEnc);
                byte[] XorEnc2 = blow(XOR2);
                System.arraycopy(XorEnc2, 0, sBoxes[i][j], 0, 4);
                System.arraycopy(XorEnc2, 0, sBoxes[i][j+1], 0, 4);
                byte[] temp = saltLeft;
                saltLeft = saltRight;
                saltRight = temp;
            }
        }
    }
}