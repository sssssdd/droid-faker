package de.rndm.droidFaker.fixtures;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: mkp
 * Date: 20.10.13
 * Time: 20:34
 * To change this template use File | Settings | File Templates.
 */
public class Country {

    /*
    @see http://www.internetworldstats.com/list2.htm
    js: s=[];t=$$('[summary=data2] tbody > tr > td:first-child a');Array.prototype.slice.call(t).forEach(function(element){s.push('"' + element.innerText + '"')});console.log(s.join(','))
     */
    private static String[] countries = {
        "Afghanistan","Africa","Albania","Algeria","American Samoa","Andorra","Angola","Anguilla","Antarctica","Antigua & Barbuda","Arabia, Saudi","Argentina","Armenia","Aruba","Asia","Australia","Austria","Azerbaijan","Bahamas, The","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bermuda","Bhutan","Bolivia","Bonaire, St.Eustat, Saba","Bosnia and Herzegovina","Botswana","Bouvet Island","Brazil","British Indian Ocean T.","British Virgin Islands","Brunei Darussalam","Bulgaria","Burkina Faso","Burundi","Cambodia","Cameroon","Canada","Cape Verde","Caribbean, the","Cayman Islands","Central African Republic","Central America","Chad","Chile","China","Christmas Island","Cocos (Keeling) Islands","Colombia","Comoros","Congo","Congo, Dem. Rep. of the","Cook Islands","Costa Rica","Cote D'Ivoire","Croatia","Cuba","Cyprus","Czech Republic","Denmark","Djibouti","Dominica","Dominican Republic","East Timor (Timor-Leste)","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia","Ethiopia","Europe","European Union","Falkland Islands (Malvinas)","Faroe Islands","Fiji","Finland","France","French Guiana","French Polynesia","French Southern Terr.","Gabon","Gambia, the","Georgia","Germany","Ghana","Gibraltar","Greece","Greenland","Grenada","Guadeloupe","Guam","Guatemala","Guernsey and Alderney","Guiana, French","Guinea","Guinea-Bissau","Guinea, Equatorial","Guyana","Haiti","Heard & McDonald Is.(AU)","Holy See (Vatican)","Honduras","Hong Kong, (China)","Hungary","Iceland","India","Indonesia","Iran, Islamic Republic of","Iraq","Ireland","Israel","Italy","Ivory Coast (Cote d'Ivoire)","Jamaica","Japan","Jersey","Jordan","","Kazakhstan","Kenya","Kiribati","Korea Dem. People's Rep.","Korea, (South) Republic of","Kosovo","Kuwait","Kyrgyzstan","Lao People's Democ. Rep.","Latvia","Lebanon","Lesotho","Liberia","Libyan Arab Jamahiriya","Liechtenstein","Lithuania","Luxembourg","Macao, (China)","Macedonia, TFYR","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Man, Isle of","Marshall Islands","Martinique (FR)","Mauritania","Mauritius","Mayotte (FR)","Mexico","Micronesia, Fed. States of","Middle East","Moldova, Republic of","Monaco","Mongolia","Montenegro","Montserrat","Morocco","Mozambique","Myanmar (ex-Burma)","Namibia","Nauru","Nepal","Netherlands","Netherlands Antilles","New Caledonia","New Zealand","Nicaragua","Niger","Nigeria","Niue","Norfolk Island","North America","Northern Mariana Islands","Norway","Oceania","Oman","Pakistan","Palau","Palestinian Territory","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Pitcairn Island","Poland","Portugal","Puerto Rico","Qatar","Reunion (FR)","Romania","Russia (Russian Fed.)","Rwanda","Sahara, Western","Saint Barthelemy (FR)","Saint Helena (UK)","Saint Kitts and Nevis","Saint Lucia","Saint Martin (FR)","S Pierre & Miquelon(FR)","S Vincent & Grenadines","Samoa","San Marino","Sao Tome and Principe","Saudi Arabia","Senegal","Serbia","Seychelles","Sierra Leone","Singapore","Slovakia","Slovenia","Solomon Islands","Somalia","South Africa","South America","S.George & S.Sandwich","South Sudan","Spain","Sri Lanka (ex-Ceilan)","Sudan","Suriname","Svalbard & Jan Mayen Is.","Swaziland","Sweden","Switzerland","Syrian Arab Republic","Taiwan","Tajikistan","Tanzania, United Rep. of","Thailand","Timor-Leste (East Timor)","Togo","Tokelau","Tonga","Trinidad & Tobago","Tunisia","Turkey","Turkmenistan","Turks and Caicos Is.","Tuvalu","","Uganda","Ukraine","United Arab Emirates","United Kingdom","United States","US Minor Outlying Isl.","Uruguay","Uzbekistan","Vanuatu","Vatican (Holy See)","Venezuela","Viet Nam","Virgin Islands, British","Virgin Islands, U.S.","Wallis and Futuna","Western Sahara","Yemen","Zambia","Zimbabwe","World Total","","ISO-3166","U.S. Census Bureau","Site Surfing Guide"
    };

    public static String getName(Random random) {
        return countries[random.nextInt(countries.length)];
    }
}