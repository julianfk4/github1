document.addEventListener("DOMContentLoaded", function () {
    var video = document.getElementById("myVideo");
    var stopButton = document.getElementById("stopButton");
    var curtainButton = document.getElementById("curtainButton");
    var curtain = document.getElementById("curtain");

    stopButton.addEventListener("mouseenter", function () {
        video.pause();
    });

    stopButton.addEventListener("mouseleave", function () {
        video.play();
    });

    curtainButton.addEventListener("click", function () {
        toggleCurtain();
        moveStopButton();
    });

    function toggleCurtain() {
        if (curtain.offsetHeight === 0) {
            curtain.style.height = "90%";
        } else if(curtain.offsetHeight == "90%"){
            curtain.style.height = "0";
        }else{
            curtain.style.height = "0";
        }
    }
    function moveStopButton() {
        if (stopButton.style.top === "calc(100% - 50px)") {
            stopButton.style.top = "20px";
            stopButton.style.width = "50px";
            stopButton.style.height = "50px";
        } else {
            stopButton.style.top = "calc(100% - 50px)";
            stopButton.style.width = "30px";
            stopButton.style.height = "30px";
        }
    }
});