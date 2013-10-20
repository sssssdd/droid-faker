package de.rndm.droidFaker.fixtures;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: mkp
 * Date: 20.10.13
 * Time: 19:34
 * To change this template use File | Settings | File Templates.
 */
public class Company {
    /*

    @see http://en.wikipedia.org/wiki/List_of_company_name_etymologies
    js: n = []; $('#mw-content-text > ul > li > a:first-child').each(function(i, e){ n.push('"'+e.title+'"')}); n.splice(-4);console.log(n.join(','))

     */
    private static String[] companies = {
        "19 Entertainment","20th Century Fox","23andme","27b/6","37signals","3Com","3M","7-Eleven","A&M Records","Great Atlantic and Pacific Tea Company","A&W Root Beer","ABN AMRO","Accenture","Acer Inc.","Adecco","Adidas","Adobe Systems","Aflac","Ahold","Ahlstrom","Akai","Akamai Technologies","AkzoNobel","AKG Acoustics","Alcatel-Lucent","Alcoa","Aldi","Alfa Romeo","Alps Electric","Alstom","AltaVista","ALZA","Amazon.com","AmBev","AMC Theatres","Advanced Micro Devices","Amdahl Corporation","Amkor Technology","Amiga Corporation","Amoco","Amstrad","Anheuser-Busch InBev","Antrix Corporation","AOL","Apache Software Foundation","Apple Inc.","Apricot Computers","Arby's","Arcelor","AREVA","Aricent","ARM Limited","Arm & Hammer","ARP Instruments, Inc.","Natura Artis Magistra","Asda","ASICS","Ask.com","Asus","Aston Martin","AT&T Inc.","Atari","ATI Technologies","ATS (wheels)","Audi","B&H Photo Video","B&Q","Babolat","Bahco","Bakkavör","Bang & Olufsen","Bally Manufacturing","Banesto","BAPE","BASF","Whirlpool Corporation","Bayer","BBC","Banco Bilbao Vizcaya Argentaria","BCC Research","BEA Systems","BEKO","BEML","Ben & Jerry's","BenQ","Bharat Heavy Electricals Limited","BHP Billiton","Société Bic","Black & Decker","BlackBerry Ltd","Blaupunkt","Blizzard Entertainment","BMW","Geoff Bodine","Boeing","Robert Bosch GmbH","Bose Corporation","Bharat Sanchar Nigam Limited","BP","BRAC (NGO)","Bridgestone","Brine, Corp.","Brooks Sports","Birmingham Small Arms Company","BT Group","Buick","Groupe Bull","Burroughs Corporation","Bultaco","ByWater Solutions","CA, Inc.","C&A","Cadillac","CAE (company)","Campagnolo","Canon (company)","Capcom","Caprabo","Carrefour","Caterpillar Inc.","Cathay Pacific Airways Limited","Casio","CBS","CDAC","Celera Corporation","Cemex","Cenex","CGI Group","Chevrolet","Chello","Chrysler","Novartis","CiCi's Pizza","Cigna","Cincom","Cisco Systems","Citroën","CKX, Inc.","Clarion (car audio)","Coca-Cola","Coleco","Colgate-Palmolive","COLT Telecom Group","Comcast","Compaq","COMSAT","ConocoPhillips","Copersucar","Corel Corporation","Cosworth","Companhia Paulista de Força e Luz","Crabtree & Evelyn","Cray","CRC Press","Cromemco","Cutco","CVS/pharmacy","Daewoo","DAF Trucks","Daihatsu","Groupe Danone","Datsun","Debian","Digital Equipment Corporation","DEKA (company)","Delhaize Group","Dell","Denning & Fourcade, Inc.","DHL Express","Dick's Sporting Goods","Digg","Digi-Key","The Walt Disney Company","DSG International (retailer)","DKNY","Dow Chemical Company","DSM (company)","Duane Reade","DuPont","Dynegy","Electronic Arts","EBay","Electronic Data Systems","Eidos Interactive","Eletropaulo","Embraer","Empresa Brasileira de Pesquisa Agropecuária","Telmex","EMC Corporation","EMI","Emporis","Equifax","Ernst & Young","Ericsson","ESPN","ESRI","Seiko Epson","Esso","Evernote","ExxonMobil","F5 Networks","Foras Aiseanna Saothair","Facebook","Fair Isaac Corporation","Fazer","French Connection (clothing)","FedEx","Fegime","Ferodo","Ferrari","Fiat","Finnair","Firestone Tire and Rubber Company","Five Guys","Fluke Corporation","Ford Motor Company","Forrester Research","FranklinCovey","Fuji Heavy Industries","Fujitsu","Garmin","Gartner","Gatti's Pizza","GCap Media","Genentech","GEICO","Gerdau","GlaxoSmithKline","Glock Ges.m.b.H.","Goodyear Tire and Rubber Company","Google","Grey Global Group","Groupon","Grundig","Gulfstream Aerospace","Häagen-Dazs","Haier","H&M","Happy Madison","Haribo","Harman Kardon","Harpo Productions","Hasbro","HBOS","Housing Development Finance Corporation","Hindustan Computers","Hess Corporation","Hewlett-Packard Company","Hispano-Suiza","Hitachi, Ltd.","HMV","Hoechst AG","Honda","Honeywell","Hospira","Hotmail","H&R Block","HSBC","HTC","Hudson's Bay Company","Hyundai Group","IBM","International Computers Limited","IG Farben","IGN Entertainment","Iiyama (company)","Imdad logistics","IKEA","IMI plc","InBev","Inditex","Infineon Technologies","Infosys","Ingenico","Inktomi (company)","Intel Corporation","Ittiam Systems","J2TV","Japan Airlines","Jat Airways","Jawa Motors","JBL","J. C. Penney","Johnson & Johnson","Jordache","JVC","Kalev (company)","Kawasaki Heavy Industries","KFC","Kenvelo","Kenwood Limited","Kenwood Electronics","Kenworth","Kia Motors","Kinko's","Kmart","Eastman Kodak","Komatsu Limited","Konica","Korg","KPMG","Kroger","KUKA","Kyocera","Larsen & Toubro","Lada","Lancôme","LCL S.A.","Lego","Lenovo Group","Lesney Products","Level 3 Communications","LG Group","Lexmark","Lionbridge","Lionhead Studios","Loblaws","Lockheed Martin","LoJack","Longines","Lonsdale (clothing)","L'Oréal","LOT Polish Airlines","Lotus Software","Lucent Technologies","Ludicorp","Lukoil","LVMH","Lycos","Maggi","Malév","MAN SE","Mandriva","Manhattan Associates","Manugistics","Manulife Financial","Mars, Incorporated","Masco Corporation","Mast-Jägermeister AG","Mattel","Maybach-Motorenbau GmbH","Mazda","MBNA","McDonald's","MCI Communications","McSweeney's","Mercedes-Benz","Merillat Industries","Metro-Goldwyn-Mayer","MFI Retail","MG Cars","Microlins","Micron Technology","Microsoft","Midway Games","Miele","Mincom Limited","Minolta","MIPRO","MIPS Technologies","MITIE","Mitel","MITRE","Mitsubishi","Moneris Solutions","Morningstar, Inc.","Motorola","Mozilla Foundation","Mozy","Madras Rubber Factory","Musco Lighting","Mustek Systems","Music and Video Club","Nabisco","NAD Electronics","Napster","NCR Corporation","NEC","Nero AG","Nestlé","Netscape","Nike, Inc.","Nikon","Nintendo","Nissan Motors","Nokia","Nortel","Novartis","Novell","OCZ Technology","Onkyo","Ooyala","Oracle Corporation","Ornge (Ontario Air Ambulance)","Osram","Össur","Paccar","PCCW","Pamida","Pemex","Pennzoil","Pepsi","Petrobras","Peugeot","Philco","Philips","Piaggio","Pioneer Corporation","Pixar","PMC-Sierra","Porsche","POW! Entertainment","Prada","PricewaterhouseCoopers","Procter & Gamble","ProfSat","Proton (carmaker)","PRS Guitars","Psion","Kuwait Petroleum International","Qantas","Qimonda","Quad Electroacoustics","Quark, Inc.","Qualcomm","QVC","Rabobank","RAND Corporation","Raytheon","RCA","Reckitt & Colman","Reckitt Benckiser","Red Hat","Reebok","Renault","REO Motor Car Company","Repsol YPF","BlackBerry Ltd","Rickenbacker","Robeez","Rolls-Royce Limited","ROLM","RSA Security","Saab Automobile","Sabre (computer system)","SAIC Motor","Saku Brewery","Samsonite","Sams Publishing","Samsung Group","Grupo Santander","Sanyo","SAP AG","Scandinavian Airlines System","SAS Institute","Sasol","Saudi Aramco","Standard Chartered Bank","Schick (razors)","Santa Cruz Operation","SEAT","Sealed Air","Sega","Seiko","Sennheiser","Silicon Graphics","Sharp Corporation","Royal Dutch Shell","Siemens AG","Six Apart","Skanska","SKF","Skoda Auto","Skype","Smart (automobile)","SmartBear Software","Smeg (appliances)","Smilebit","SNK Playmore","Sony","SuperCalc","SPAR","Sperry Corporation","Spiratone","Sprint Nextel","SRAM Corporation","SRI International","Stanley Works","Starbucks","Stellent","Sturm, Ruger","STX","Subaru","Sun Microsystems","SUSE Linux distributions","Suzuki","Taco Bell","Techniques d'Avant Garde","TAG Heuer","Talgo","TAM Airlines","TAP Portugal","Taser International","Tata Group","Taxan","TCBY","TCL Corporation","Tata Consultancy Services","TDK Corporation","Textron","Tokyo Electric Power Company","Tesco","Naot","Texaco","THX","THY","TIBCO Software","Tim Hortons","TNT N.V.","Toshiba","Toyota","Lines Bros","Tucows","Tungsram","TVR","TWA","Twinings","Twitter","Ubuntu Foundation","Umbro","Unilever","UNIMED","Unisys","Unocal Corporation","United Parcel Service","UUNET","Vaisala","Valero Energy Corporation","Valtra","Varig","Verizon Communications","Virgin Group","VMware Inc.","Vodafone","Volkswagen","Volvo","Wachovia","Waitrose","Walgreens","Walmart","Wang Laboratories","Wells Fargo","Wendy's","Weta Digital","W H Smith","Williams-Sonoma","Wipro Technologies","Wonderware","Worlds of Wonder (toy company)","WPP Group","WWE","Xerox","XIX Entertainment","Xobni","XTO Energy","Yahoo!","YKK Group","Yakult","Yamaha","Yoplait","Zamzar","Zend Technologies","Zero Halliburton","Zimmer, Inc.","Zuse","Zynga"
    };

    public static String getName(Random random) {
        return companies[random.nextInt(companies.length)];
    }
}