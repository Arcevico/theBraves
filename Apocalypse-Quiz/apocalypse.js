/*jshint browser: true*/

/* ======== ARRAY OF QUESTIONS ================*/

var myQuestions = [
  {
    "question": "How Big is the Observable Universe?",
    "imageURL":  "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Observable_universe_logarithmic_illustration.png/220px-Observable_universe_logarithmic_illustration.png",
    "answers": {
      "a": "Really Big",
      "b": "93 Billion Light years across",
      "c": "17 Billion Light years across"
    },
    "correctAnswer": "93 Billion Light years across",
    "wrongAnswer": "17 Billion Light years across",
    "honorableAnswer": "17 Billion Light years across"

	},
  {
    "question": "Which one is the closest Star to our Sun?",
    "imageURL": "https://orig00.deviantart.net/5786/f/2013/025/7/1/free_sun_stock_image_by_lyra_elante-d5spggh.png",
    "answers": {
      "a": "Alpha Centauri A",
      "b": "Star Light, Star Bright",
      "c": "Proxima Centauri"
    },
    "correctAnswer": "Proxima Centauri"
	},
  {
    "question": "The brightest star in the night sky is:",
    "imageURL": "http://www.clker.com/cliparts/N/K/6/u/K/I/north-star-hi.png",
    "answers": {
      "a": "Star Trek",
      "b": "Sirius",
      "c": "The North Star"
    },
    "correctAnswer": "The North Star"
  },
  {
    "question": "What is a globular cluster?",
    "imageURL": "https://sites.google.com/a/umich.edu/jessie-muir/_/rsrc/1491259784399/cartoons/galaxycluster/galaxy_cluster.png?height=376&width=400",
    "answers": {
      "a": "A spherical group of stars bound together by gravity",
      "b": "Bad weather",
      "c": "A condensation of heavy metal elements in a star's core"
    },
    "correctAnswer": "A spherical group of stars bound together by gravity"
  },
  {
    "question": "How many stars are in our Milky Way galaxy?",
    "imageURL": "https://upload.wikimedia.org/wikipedia/commons/8/8b/4_Milky_Way_%28blank_2%29.png",
    "answers": {
      "a": "7",
      "b": "300 billion",
      "c": "Too many"
    },
    "correctAnswer": "300 billion"
  },
  {
    "question": "The class of stars that lose mass rapidly as it flies off in a stellar wind is called:",
    "imageURL": "http://www.zaxtor.net/Rigel.png",
    "answers": {
      "a": "Cepheid Stars",
      "b": "Dieting Stars",
      "c": "Wolf-Rayet Stars"
    },
    "correctAnswer": "Wolf-Rayet Stars"
  },
  {
    "question": "When a star runs out of fuel for nuclear fusion and dies in an explosion, it's called:",
    "imageURL": "http://www.redorbit.com/media/uploads/2016/05/supernova.jpg",
    "answers": {
      "a": "Supernova",
      "b": "Standard Candle",
      "c": "Tantrum"
    },
    "correctAnswer": "Supernova"
  },
  {
    "question": "Which quality determines whether a star will become a black hole when it dies?",
    "imageURL": "http://icons.iconarchive.com/icons/zairaam/bumpy-planets/256/blackhole-icon.png",
    "answers": {
      "a": "Its temperature",
      "b": "Its attitude",
      "c": "Its mass"
    },
    "correctAnswer": "Its mass"
  },
  {
    "question": "The sun is currently categorized as a :",
    "imageURL": "http://www.officialpsds.com/images/thumbs/---Burning-Sun-psd101075.png",
    "answers": {
      "a": "Red giant star",
      "b": "Main-sequence star",
      "c": "Shooting star"
    },
    "correctAnswer": "Main-sequence star"
  },
  {
    "question": "Which of the following is NOT a known type of star:",
    "imageURL": "http://images.clipartpanda.com/dwarf-clipart-clipsnow15.gif",
    "answers": {
      "a": "Green dwarf",
      "b": "White dwarf",
      "c": "Brown dwarf"
    },
    "correctAnswer": "Green dwarf"
  }
];

/*console.log("Length: " + myQuestions.length);*/

/* =====================  END OF ARRAY OF QUESTIONS ====================================== */


/* ---- My Variables -------*/
var indexCounter = 0;
var options = "";
var correctAnswers = 0;
var usersAnswers = [];
var answer = "";
/*--------------------------*/


/*Start Button*/
var enterB = document.getElementById("enterB");
enterB.addEventListener("click", helloFunction, false);



/* ----- Function for Start Button Event -------*/
function helloFunction() {
    console.log("Index Counter: " + indexCounter);
    document.getElementById("titleS").style.display = "none";
    document.getElementById("quizC").style.display = "flex";
    
    
    /* Placing header and question text in HTML*/
    document.getElementById("questionS").innerHTML = "";
    document.getElementById("question").innerHTML = "Question " + (indexCounter + 1) + "/10";
    document.getElementById("options").innerHTML = "";
    document.getElementById("questionS").innerHTML = myQuestions[indexCounter].question + "<br><br><br>";
    document.getElementById("imgC").style.backgroundImage = "url(" + myQuestions[indexCounter].imageURL + ")";
    
    
    /* Placing radio buttons */
    document.getElementById("options").innerHTML += '<label><input type="radio" name="option" value="' + myQuestions[indexCounter].answers.a + '">' + myQuestions[indexCounter].answers.a + '</label><br><br>';
    document.getElementById("options").innerHTML += '<label><input type="radio" name="option" value="' + myQuestions[indexCounter].answers.b + '">' + myQuestions[indexCounter].answers.b + '</label><br><br>';
    document.getElementById("options").innerHTML += '<label><input type="radio" name="option" value="' + myQuestions[indexCounter].answers.c + '">' + myQuestions[indexCounter].answers.c + '</label><br><br>';
    

    /* Iterate all questions, creating an index counter for every option */
    options = document.getElementsByName("option");
    for (var i = 0; i < options.length; i++) {
        options[i].addEventListener("click", checkFunction, false);
    }

    indexCounter++;
}
/* -------------------------------------------------------------------- */





/* ---------  Function for Next button Event ---------------------------*/
var nextBtn = document.getElementById("nextBtn");
nextBtn.addEventListener("click", nextFunction, false);


function nextFunction() {
    
    
    /* Push selected answers into array */
    usersAnswers.push(answer);
    
    
    /* Prevent user from proceding without selecting answer */
    document.getElementById("nextBtn").disabled = true;

    
    
    /* Updates question counter */
    document.getElementById("question").innerHTML = "Question " + (indexCounter + 1) + "/10";

    
    
    /* Outputs the question and the Image */
    if (indexCounter < myQuestions.length) {
        document.getElementById("questionS").innerHTML = "";
        document.getElementById("options").innerHTML = "";
        document.getElementById("questionS").innerHTML = myQuestions[indexCounter].question + "<br><br>"; //Outputs the question
        document.getElementById("imgC").style.backgroundImage = "URL(" + myQuestions[indexCounter].imageURL + ")"; // Outputs the Image

        

        
        
        /*-------- Output the Options to be answered ------------*/
        document.getElementById("options").innerHTML += '<label><input type="radio" id="myOption" name="option" value="' + myQuestions[indexCounter].answers.a + '">' + myQuestions[indexCounter].answers.a + '</label><br><br>';
        document.getElementById("options").innerHTML += '<label><input type="radio" name="option" value="' + myQuestions[indexCounter].answers.b + '">' + myQuestions[indexCounter].answers.b + '</label><br><br>';
        document.getElementById("options").innerHTML += '<label><input type="radio" name="option" value="' + myQuestions[indexCounter].answers.c + '">' + myQuestions[indexCounter].answers.c + '</label><br><br>';

        
        
        
        /* Runs the program until the end of questions and only after go to Results*/
        options = document.getElementsByName("option");
        for (var i = 0; i < options.length; i++) {
            options[i].addEventListener("click", checkFunction, false);
        }

        indexCounter++;
    } else {
        document.getElementById("quizC").style.display = "none";
        document.getElementById("resultS").style.display = "flex";

        
        
        
        
        
        /* Checks for correct answers*/
        for (var j = 0; j < myQuestions.length; j++) {
            if (usersAnswers[j] == myQuestions[j].correctAnswer) {
                correctAnswers++;
                console.log("Correct: " + usersAnswers[j]);
            } else {
                console.log("Wrong: " + usersAnswers[j] + " | " + myQuestions[j].correctAnswer);
            }
        }
        
        
    
        
        
        
        /* Change Result text according to correct answers */
        if (correctAnswers === 0) {
            document.getElementById("result").innerHTML = "You missed every question.. Why not give it another go?";
        } else if (correctAnswers == 1) {
            document.getElementById("result").innerHTML = "You had " + correctAnswers + "  correct answer. You can do better!";

        } else if (correctAnswers <= 5) {
            document.getElementById("result").innerHTML = "You had " + correctAnswers + " correct answers! You are showing some potential!";
        } else if (correctAnswers <= 9) {
            document.getElementById("result").innerHTML = "You had " + correctAnswers + " correct answers! I'm impressed!";
        } else if (correctAnswers === 10) {
            document.getElementById("result").innerHTML = "You know all " + correctAnswers + " answers !?!  Stephen Hawking wants to see you!";
        }
    }

}
/* --- Doesnt allow user to advance without selecting an option ---------------*/
function checkFunction() {
    for (var i = 0; i < options.length; i++) {
        if (options[i].checked) {
            answer = options[i].value;
            document.getElementById("nextBtn").disabled = false;
        }
    }
}
/*\------------------------------------------------------------------------------*/


/* Restart the Game */
var tryAgain = document.getElementById("tryAgain");
tryAgain.addEventListener("click", retryF, false);

function retryF() {
    location.reload();
}
/*======================================*/
