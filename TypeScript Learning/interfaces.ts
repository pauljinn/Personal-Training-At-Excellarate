interface Namepro {
  firstname: string;
  lastname: string;
}

let namets = (namepro: Namepro) => {
  console.log(namepro.firstname + " " + namepro.lastname);
};

namets({ firstname: "Aman", lastname: "Soni" });
