/**
 * 
 */

var app = app || {};

$('#user-table').bootstrapTable({
	pagination: true,
	pageSize: 3,
	pageList: [10, 25, 50, 100],
	columns: [{
		field: 'username',
		title: 'Tên đăng nhập'
	}, {
		field: 'name',
		title: 'Tên đầy đủ',
	}, {
		field: 'id',
		title: 'Email'
	}],
	data: [{
		username: 'sg0001',
		name: 'Nguyễn Quốc Tuấn',
	}, {
		username: 'sg0002',
		name: 'Hoàng Văn B'
	}, {
		username: 'sg0003',
		name: 'Hoàng Văn C'
	}, {
		username: 'sg0004',
		name: 'Hoàng Văn D'
	}, {
		username: 'sg0005',
		name: 'Hoàng Văn E'
	}, {
		username: 'sg0006',
		name: 'Hoàng Văn F'
	}]
});