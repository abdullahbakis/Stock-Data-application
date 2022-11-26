// Change Theme
function changeTheme() {
  let body = document.body;
  body.className =
    body.className === "theme-dark" ? "theme-light" : "theme-dark";

  let view = document.getElementById("view");
  view.className =
    view.className === "bi bi-sun-fill" ? "bi bi-moon-fill" : "bi bi-sun-fill";
}

let langResourcesArr = {
  en: {
    hello: "Hello!",
    welcome: "Welcome to my app!",
  },
  fr: {
    hello: "Bonjour!",
    welcome: "Bienvenue sur mon appli!",
  },
  it: {
    hello: "Ciao!",
    welcome: "Benvenuto nella mia app!",
  },
};

function changeLanguage(clickedLangChoiceId) {
  // 1
  $(function () {
    // 2
    $("#greetings-list")
      .children(".greet")
      .each(function () {
        // 3
        let currentlyIteratedGreetKey = $(this).attr("key"); // 4
        let localizedValForGreetKey =
          langResourcesArr[clickedLangChoiceId][currentlyIteratedGreetKey]; // 5
        $(this).text(localizedValForGreetKey); // 6
      });
  });
}
