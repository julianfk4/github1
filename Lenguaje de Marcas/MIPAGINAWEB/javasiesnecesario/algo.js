document.addEventListener("DOMContentLoaded", function () {
    var video = document.getElementById("myVideo");
    var stopButton = document.getElementById("stopButton");

    stopButton.addEventListener("mouseenter", function () {
        video.pause();
    });

    stopButton.addEventListener("mouseleave", function () {
        video.play();
    });
});
