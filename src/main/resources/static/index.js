$(function (){
   hentAlle();
});

function hentAlle(){
    $.get("/hentAlle", function(biler){
        formaterData(biler);
    });
}

function formaterData(biler){
    let ut = "<table class='table table-striped'><tr>"+
        "<th>Personnr</th><th>Navn</th><th>Adresse</th><th>Kjennetegn</th><th>Merke</th><th>Type</th>"+
        "<th></th><th></th></tr>";
    for (const bil of biler){
        ut += "<tr>";
        ut += "<td>"+bil.personnr+"</td><td>"+bil.navn+"</td><td>"+bil.adresse+"</td><td>"+bil.kjennetegn+"</td><td>"+bil.merke+"</td><td>"+bil.type+"</td>";
        ut += "<td> <button class='btn btn-primary' onclick='idTilEndring("+bil.id+")'>Endre</button></td>";
        ut += "<td> <button class='btn btn-danger' onclick='slettEnMotorvogn("+bil.personnr+")'>Slett</button></td>"
        ut += "</tr>";
    }
    ut += "</table>";
    $("#bilene").html(ut);
}

function idTilEndring(id){
    window.location.href="/endring.html?"+id;
}

function slettEnMotorvogn(personnr){
    const url = "/slettEnMotorvogn?personnr="+personnr;
    $.get(url, function (){
       window.location.href="/";
    });
}

function slettAlle(){
    $.get("/slettAlle", function (){
        hentAlle();
    });
}