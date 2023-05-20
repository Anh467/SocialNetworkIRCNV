// JavaScript code to generate and update the charts

// Chart 1: Thống kê số bài post trong từng tháng
var postChartData = {
    labels: [],
    datasets: [{
            label: 'Number of Posts',
            data: [],
            backgroundColor: 'rgba(54, 162, 235, 0.5)',
            borderColor: 'rgba(54, 162, 235, 1)',
            borderWidth: 1
        }]
};
var postChart = new Chart(document.getElementById('postChartCanvas'), {
    type: 'bar',
    data: postChartData,
    options: {
        responsive: true,
        scales: {
            y: {
                beginAtZero: true
            }
        }
    }
});
// Function to get data and labels 
window.onload = function () {
    fetchData();
    setInterval(fetchData, 2000);
    $.ajax({
        url: "../getPostStatistics",
        method: "GET",
        dataType: "json",
        success: function (data) {
            updateChartData(data);
        },
        error: function (xhr, status, error) {
            console.log("Error:", error);
        }
    });
};
function fetchData() {
    $.ajax({
        url: "../getPostStatistics",
        method: "GET",
        dataType: "json",
        success: function (data) {
            updateChartData(data);
        },
        error: function (xhr, status, error) {
            console.log("Error:", error);
        }
    });
}

// Function to update data and labels 
function updateChartData(data) {
    var labels = []; // Mảng nhãn cho biểu đồ
    var postCounts = []; // Mảng dữ liệu số bài post

    // Duyệt qua từng đối tượng PostStatistics trong danh sách data
    for (var i = 0; i < data.length; i++) {
        var postStat = data[i];
        labels.push(postStat.month); // Thêm giá trị tháng vào mảng nhãn
        postCounts.push(postStat.postNumber); // Thêm giá trị số bài post vào mảng dữ liệu
    }

    // Cập nhật dữ liệu và nhãn cho biểu đồ
    postChartData.labels = labels;
    postChartData.datasets[0].data = postCounts;

    // Cập nhật biểu đồ
    postChart.update();
}