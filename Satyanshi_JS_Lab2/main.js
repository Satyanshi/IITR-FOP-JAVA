const quizContainer = document.getElementById('quiz');
const questionElement = document.getElementById('question');
const choiceButtons = Array.from(document.querySelectorAll('.buttons button span'));
const progressText = document.getElementById('progress');
let current = 0;
let score = 0;

const questions = [
  {
    question: 'Which of the following is a linear data structure ?',
    choices: ['Array', 'AVL Trees', 'Binary Trees', 'Graphs'],
    correctAnswer: 0
  },
  {
    question: 'Which of the following is not the type of queue ?',
    choices: ['Priority queue', 'Single-ended queue', 'Circular queue', 'Ordinary queue'],
    correctAnswer: 1
  },
  {
    question: 'Inside which HTML element do we put the Javascript ?',
    choices: ['<javascript>', '<script>', '<scripting>', '<js>'],
    correctAnswer: 1
  },
  {
    question: 'In javascript "===" operator defines what ?',
    choices: ['Non-identical', 'Is identical (is equal to and is of the different type)', 'Is identical (is equal to and is of the same type)', 'Is equal to'],
    correctAnswer: 2
  }
];

function startQuiz() {
  showQuestion();
}

function showQuestion() {
  if (current === questions.length) {
    showResults();
    return;
  }

  const currentQuestion = questions[current];
  questionElement.textContent = currentQuestion.question;
  choiceButtons.forEach((choiceButton, index) => {
    choiceButton.textContent = currentQuestion.choices[index];
    choiceButton.parentElement.onclick = () => selectAnswer(index);
  });

  progressText.textContent = `Question ${current + 1} of ${questions.length}`;
}

function selectAnswer(answer) {
  if (answer === questions[current].correctAnswer) {
    score++;
  }
  current++;
  showQuestion();
}

function showResults() {
  quizContainer.innerHTML = `
    <h1>Quiz Results</h1>
    <hr style="margin-bottom: 20px">
    <p>Your score: ${score} out of ${questions.length} questions</p>
    <p>Your percentage: ${(score / questions.length * 100).toFixed(2)}%</p>
  `;
}

startQuiz();