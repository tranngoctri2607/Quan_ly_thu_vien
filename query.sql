create database QuanLyThuVien;

use QuanLyThuVien;

create table QuanLySach(
	IDsach varchar(10) primary key ,
	TenSach nvarchar(100) ,
	GiaMuon int,
	NamXuatBan int,
	SoLuong int,
	TheLoai nvarchar(50)
);

create table QuanLySinhVien(
	IDsinhvien varchar(10) primary key ,
	TenSinhVien nvarchar(50),
	DiaChiNha nvarchar(100),
	SDT int,
	Email nvarchar(30),
	MatKhau varchar(30)
);

create table QuanLyMuonTra(
	IDphieu int identity primary key,
	IDsach varchar(10) 
	foreign key (IDsach) references dbo.QuanLySach(IDsach),
	IDsinhvien varchar(10)
	foreign key (IDsinhvien) references dbo.QuanLySinhVien(IDsinhvien),
	NgayMuon date,
	NgayTra date,
);

insert into dbo.QuanLySach(IDsach, TenSach, GiaMuon, NamXuatBan, SoLuong, TheLoai)
values
	('A01', N'Số đỏ', '7800', '2016', '11', N'Giải trí'),
	('A02', N'Tôi thấy hoa vàng trên cỏ xanh', '9300', '2022', '12', N'Giải trí'),
	('A03', N'Tắt đèn', '4000', '2020', '11', N'Giải trí'),
	('A04', N'Chí Phèo', '6800', '2022', '13', N'Giải trí'),
	('B01', N'Trò Chuyện Với Cõi Vô Hình', '14350', '2021', '14', N'Tôn giáo'),
	('B02', N'Đạo của vật lý', '13400', '2015', '15', N'Tôn giáo'),
	('B03', N'Sức mạnh của sự cô đơn', '5750', '2014', '16', N'Tâm lý học'),
	('C01', N'Các Triều Đại Việt Nam', '66650', '2021', '14', N'Lịch sử'),
	('C02', N'Việt Nam sử lược', '33150', '2022', '17', N'Lịch sử'),
	('C03', N'Trần Triều Nhàn Thoại', '10900', '2022', '13', N'Lịch sử'),
	('G01', N'Quyền lực của Địa lý', '11680', '2022', '16', N'Địa lý. Nhân chủng học'),
	('G02', N'Hoàng sa, Trường sa - Chủ quyền của Việt Nam', '19260', '2021', '12', N'Địa lý. Nhân chủng học'),
	('G03', N'Atlas Thế Giới', '11360', '2022', '13', N'Địa lý. Nhân chủng học'),
	('H01', N'Đừng Biện Hộ Cho Rác!', '9200', '2022', '13', N'Khoa học xã hội'),
	('H02', N'Tâm trí tội phạm', '19900', '2022', '20', N'Khoa học xã hội'),
	('H03', N'Tội phạm đa nhân cách', '17520', '2023', '13', N'Khoa học xã hội'),
	('J01', N'44 đời tổng thống Hoa Kỳ', '48150', '2016', '12', N'Khoa học chính trị'),
	('J02', N'Thế Giới 2013 (The Economist)', '12650', '2013', '13', N'Khoa học chính trị'),
	('J03', N'Thế Chiến Thứ Ba - Chiến Tranh Mạng Lưới', '11700', '2017', '12', N'Khoa học chính trị'),
	('K01', N'Bộ luật Dân sự', '9000', '2017', '19', N'Luật pháp'),
	('K02', N'Sách Luật Đất đai', '15000', '2018', '12', N'Luật pháp'),
	('K03', N'Bộ luật Thương mại', '18000', '2022', '11', N'Luật pháp'),
	('L01', N'Hành trang lập trình', '15200', '2020', '10', N'Giáo dục'),
	('L02', N'Tóm Tắt Kiến Thức Toán Phổ Thông', '14500', '2021', '9', N'Giáo dục'),
	('L03', N'Lập Trình Viên - Phù Thủy Thế Giới Mạng', '15000', '2019', '21', N'Giáo dục'),
	('M01', N'Giải Mã Ngành Công Nghiệp Âm Nhạc', '30000', '2022', '16', N'Âm nhạc'),
	('M02', N'Tìm hiểu nghệ thuật Đờn ca tài tử', '6000', '2017', '16', N'Âm nhạc'),
	('M03', N'Beethoven: Âm Nhạc Và Cuộc Đời', '33900', '2020', '18', N'Âm nhạc'),
	('N01', N'Hiểu Và Thưởng Thức Một Tác Phẩm Mỹ Thuật', '17000', '2022', '11', N'Mỹ thuật'),
	('N02', N'Đây là Van Gogh', '15000', '2020', '12', N'Mỹ thuật'),
	('N03', N'Đây là Leonardo Da Vinci', '15000', '2020', '11', N'Mỹ thuật'),
	('P01', N'Văn Học - Khái Lược Những Tư Tưởng Lớn', '30000', '2022', '16', N'Ngôn ngữ và văn học'),
	('P02', N'Ngôn ngữ với Văn chương', '9000', '2021', '17', N'Ngôn ngữ và văn học'),
	('P03', N'Câu chuyện Ngôn ngữ', '13500', '2021', '15', N'Ngôn ngữ và văn học'),
	('Q01', N'Bách khoa thư Khoa học', '30000', '2020', '14', N'Khoa học'),
	('Q02', N'Khoa học - Khái lược những tư tưởng lớn', '29000', '2021', '12', N'Khoa học'),
	('Q03', N'1000 Phát minh và Khám phá vĩ đại', '45000', '2022', '13', N'Khoa học'),
	('R03', N'Siêu tổ chức Con người', '18700', '2022', '15', N'Y học'),
	('R04', N'Ung thư Hiểu để chữa lành', '16050', '2020', '18', N'Y học'),
	('R05', N'Cẩm nang châm cứu (Tái bản)', '15300', '2017', '12', N'Y học'),
	('S01', N'Nông trại nuôi sống chúng ta', '10000', '2020', '11', N'Nông nghiệp. Kiến trúc. Phong cảnh'),
	('S02', N'Làm Vườn Hữu Cơ For Dummies', '17000', '2022', '10', N'Nông nghiệp. Kiến trúc. Phong cảnh'),
	('S03', N'Kiến Trúc Cảnh Quan Việt Nam - Truyền Thống Và Hiện Đại', '9500', '2017', '11', N'Nông nghiệp. Kiến trúc. Phong cảnh'),
	('T01', N'Nghệ thuật Thiết kế game', '39700', '2023', '12', N'Kỹ thuật'),
	('T02', N'Phân Tích Kỹ Thuật Từ A Đến Z (Technical Analysis from A to Z)', '16500', '2013', '13', N'Kỹ thuật'),
	('T03', N'Nghệ thuật Thiết kế game', '39700', '2023', '13', N'Kỹ thuật'),
	('U01', N'Tôn tử binh pháp', '15000', '2017', '14', N'Quân sự'),
	('U02', N'Chủ tịch Hồ Chí Minh với Quân đội nhân dân Việt Nam Anh hùng', '36500', '2018', '15', N'Quân sự'),
	('U03', N'Lịch sử Truyền thống Quân đội nhân dân Việt Nam', '33500', '2017', '12', N'Quân sự'),
	('V01', N'Văn hóa Nước và Hàng hải Việt Nam', '17500', '2017', '16', N'Hàng hải'),
	('V02', N'Phác thảo Dân tộc học Hàng hải Việt Nam', '12000', '2018', '6', N'Hàng hải'),
	('V03', N'Ảnh Hưởng Của Sức Mạnh Trên Biển Đối Với Lịch Sử, 1660 – 1783', '12000', '2018', '12', N'Hàng hải'),
	('Z01', N'Cẩm Nang Công Tác Thư Viện Trường Học Trong Thời Kỳ Hiện Đại', '37000', '2019', '13', N'Thư mục. Xuất bản. Thư viện học'),
	('Z02', N'Nghề Thư Viện - Librarianship', '9000', '2019', '12', N'Thư mục. Xuất bản. Thư viện học'),
	('Z03', N'Biên mục mô tả trong nghiệp vụ Thư viện', '15500', '2019', '11', N'Thư mục. Xuất bản. Thư viện học')

insert into dbo.QuanLySinhVien(IDsinhvien, TenSinhVien, DiaChiNha, SDT, Email, MatKhau)
values
	('PS27034', N'Nguyễn Hoàng Phúc', N'21/3 Bông Sao, P.5, Q.8', '0839660769', N'phucps27034@gmail.com', '0839660769'),
	('PS27033', N'Nguyễn Minh Tài', N'60 Thiên Hộ Dương, P3, Q.Gò Vấp', '0764333323', N'taips27033@gmail.com', '0764333323'),
	('PS26961', N'Trần Ngọc Trí', N'48A, Dương Thị Mười, P.Tân Chánh Hiệp, Q.12', '0826751441', N'trips26961@gmail.com', '0826751441'),
	('PS27057', N'Bùi Thanh Liêm', N'577/12 Quốc Lộ 50, P.Bình Hưng, H.Bình Chánh', '0363916081', N'liemps27057@gmail.com', '0363916081'),
	('PS26942', N'Nguyễn Văn Nam', N'14/5 đường số 53 P.14, Q.Gò Vấp', '0377088935', N'namps26942@gmail.com', '0377088935'),
	('PS27065', N'Mai Nguyễn Văn Kiệt', N'455/6 Tô Ký P.Tân Chánh Hiệp, Q.12', '0392771535', N'kietps27065@gmail.com', '0392771535')

insert into dbo.QuanLyMuonTra(IDsach, IDsinhvien, NgayMuon, NgayTra)
values
	('H02', 'PS27034', '2023-02-13', '2023-02-26'),
	('S02', 'PS27034', '2023-02-10', '2023-02-22'),
	('Z02', 'PS27034', '2023-02-07', '2023-02-16'),
	('A04', 'PS27033', '2023-01-23', '2023-02-03'),
	('M01', 'PS27033', '2023-01-10', '2023-01-23'),
	('H02', 'PS27033', '2023-01-03', '2023-01-13'),
	('S03', 'PS26942', '2022-12-23', '2023-01-03')

insert into dbo.QuanLyMuonTra(IDsach, IDsinhvien, NgayMuon, NgayTra)
values
	('H02', 'PS27034', '2022-06-12', '2023-06-22'),
	('H02', 'PS27034', '2022-07-13', '2023-07-23'),
	('H02', 'PS27034', '2022-08-14', '2023-08-24'),
	('H02', 'PS27034', '2022-09-15', '2023-09-25'),
	('H02', 'PS27034', '2022-10-16', '2023-10-26'),
	('H02', 'PS27034', '2022-11-17', '2023-11-27'),
	('H02', 'PS27034', '2022-12-18', '2023-12-28')