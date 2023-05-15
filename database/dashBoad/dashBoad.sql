CREATE TABLE PostStatistics (
    MonthDate DATE,
    PostCount INT
);
CREATE TABLE SocialMediaUsage (
    MonthDate DATE,
    UsageHours FLOAT
);

CREATE TABLE MonthlyUserCount (
    MonthDate DATE,
    UserCount INT
);

CREATE TABLE SignupStatistics (
    MonthDate DATE,
    SignupCount INT
);


DECLARE @ThisMonth DATE = DATEFROMPARTS(YEAR(GETDATE()), MONTH(GETDATE()), 1);

-- Thêm dữ liệu cho bảng PostStatistics
INSERT INTO PostStatistics (MonthDate, PostCount) VALUES
    (DATEADD(MONTH, -20, @ThisMonth), 50),
    (DATEADD(MONTH, -19, @ThisMonth), 65),
    (DATEADD(MONTH, -18, @ThisMonth), 80),
    (DATEADD(MONTH, -17, @ThisMonth), 45),
    (DATEADD(MONTH, -16, @ThisMonth), 70),
    (DATEADD(MONTH, -15, @ThisMonth), 55),
    (DATEADD(MONTH, -14, @ThisMonth), 60),
    (DATEADD(MONTH, -13, @ThisMonth), 75),
    (DATEADD(MONTH, -12, @ThisMonth), 90),
    (DATEADD(MONTH, -11, @ThisMonth), 85),
    (DATEADD(MONTH, -10, @ThisMonth), 100),
    (DATEADD(MONTH, -9, @ThisMonth), 95),
    (DATEADD(MONTH, -8, @ThisMonth), 110),
    (DATEADD(MONTH, -7, @ThisMonth), 105),
    (DATEADD(MONTH, -6, @ThisMonth), 95),
    (DATEADD(MONTH, -5, @ThisMonth), 130),
    (DATEADD(MONTH, -4, @ThisMonth), 115),
    (DATEADD(MONTH, -3, @ThisMonth), 125),
    (DATEADD(MONTH, -2, @ThisMonth), 140),
    (DATEADD(MONTH, -1, @ThisMonth), 120),
	(@ThisMonth, 156);

-- Thêm dữ liệu cho bảng SocialMediaUsage
INSERT INTO SocialMediaUsage (MonthDate, UsageHours) VALUES
    (DATEADD(MONTH, -20, @ThisMonth), 3.5),
    (DATEADD(MONTH, -19, @ThisMonth), 4.2),
    (DATEADD(MONTH, -18, @ThisMonth), 3.8),
    (DATEADD(MONTH, -17, @ThisMonth), 4.5),
    (DATEADD(MONTH, -16, @ThisMonth), 4.1),
    (DATEADD(MONTH, -15, @ThisMonth), 4.8),
    (DATEADD(MONTH, -14, @ThisMonth), 3.9),
    (DATEADD(MONTH, -13, @ThisMonth), 4.2),
    (DATEADD(MONTH, -12, @ThisMonth), 3.7),
    (DATEADD(MONTH, -11, @ThisMonth), 4.4),
    (DATEADD(MONTH, -10, @ThisMonth), 4.1),
    (DATEADD(MONTH, -9, @ThisMonth), 3.6),
    (DATEADD(MONTH, -8, @ThisMonth), 4.3),
    (DATEADD(MONTH, -7, @ThisMonth), 3.8),
    (DATEADD(MONTH, -6, @ThisMonth), 4.5),
    (DATEADD(MONTH, -5, @ThisMonth), 4.2),
    (DATEADD(MONTH, -4, @ThisMonth), 4.7),
    (DATEADD(MONTH, -3, @ThisMonth), 4.4),
    (DATEADD(MONTH, -2, @ThisMonth), 3.9),
    (DATEADD(MONTH, -1, @ThisMonth), 4.6),
    (@ThisMonth, 5.2);

INSERT INTO MonthlyUserCount (MonthDate, UserCount) VALUES
    (DATEADD(MONTH, -20, @ThisMonth), 500),
    (DATEADD(MONTH, -19, @ThisMonth), 550),
    (DATEADD(MONTH, -18, @ThisMonth), 600),
    (DATEADD(MONTH, -17, @ThisMonth), 525),
    (DATEADD(MONTH, -16, @ThisMonth), 580),
    (DATEADD(MONTH, -15, @ThisMonth), 540),
    (DATEADD(MONTH, -14, @ThisMonth), 610),
    (DATEADD(MONTH, -13, @ThisMonth), 550),
    (DATEADD(MONTH, -12, @ThisMonth), 600),
    (DATEADD(MONTH, -11, @ThisMonth), 560),
    (DATEADD(MONTH, -10, @ThisMonth), 630),
    (DATEADD(MONTH, -9, @ThisMonth), 590),
    (DATEADD(MONTH, -8, @ThisMonth), 650),
    (DATEADD(MONTH, -7, @ThisMonth), 610),
    (DATEADD(MONTH, -6, @ThisMonth), 670),
    (DATEADD(MONTH, -5, @ThisMonth), 630),
    (DATEADD(MONTH, -4, @ThisMonth), 690),
    (DATEADD(MONTH, -3, @ThisMonth), 650),
    (DATEADD(MONTH, -2, @ThisMonth), 710),
    (DATEADD(MONTH, -1, @ThisMonth), 670),
    (@ThisMonth, 730);

INSERT INTO SignupStatistics (MonthDate, SignupCount) VALUES
    (DATEADD(MONTH, -20, @ThisMonth), 150),
    (DATEADD(MONTH, -19, @ThisMonth), 165),
    (DATEADD(MONTH, -18, @ThisMonth), 180),
    (DATEADD(MONTH, -17, @ThisMonth), 145),
    (DATEADD(MONTH, -16, @ThisMonth), 170),
    (DATEADD(MONTH, -15, @ThisMonth), 155),
    (DATEADD(MONTH, -14, @ThisMonth), 160),
    (DATEADD(MONTH, -13, @ThisMonth), 175),
    (DATEADD(MONTH, -12, @ThisMonth), 190),
    (DATEADD(MONTH, -11, @ThisMonth), 185),
    (DATEADD(MONTH, -10, @ThisMonth), 200),
    (DATEADD(MONTH, -9, @ThisMonth), 195),
    (DATEADD(MONTH, -8, @ThisMonth), 210),
    (DATEADD(MONTH, -7, @ThisMonth), 205),
    (DATEADD(MONTH, -6, @ThisMonth), 195),
    (DATEADD(MONTH, -5, @ThisMonth), 230),
    (DATEADD(MONTH, -4, @ThisMonth), 215),
    (DATEADD(MONTH, -3, @ThisMonth), 225),
    (DATEADD(MONTH, -2, @ThisMonth), 240),
    (DATEADD(MONTH, -1, @ThisMonth), 220),
    (@ThisMonth, 256);