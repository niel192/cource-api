<body>
	<h1>Course API</h1>
	<p>This is a simple API for managing courses. It provides endpoints for creating, retrieving, updating and deleting courses.</p>
<h2>Endpoints</h2>
<table>
	<tr>
		<th>Method</th>
		<th>Endpoint</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>GET</td>
		<td>/api/courses</td>
		<td>Get a list of all courses</td>
	</tr>
	<tr>
		<td>GET</td>
		<td>/api/courses/{id}</td>
		<td>Get a course by its ID</td>
	</tr>
	<tr>
		<td>POST</td>
		<td>/api/courses</td>
		<td>Create a new course</td>
	</tr>
	<tr>
		<td>PUT</td>
		<td>/api/courses/{id}</td>
		<td>Update an existing course</td>
	</tr>
	<tr>
		<td>DELETE</td>
		<td>/api/courses/{id}</td>
		<td>Delete a course by its ID</td>
	</tr>
</table>

<h2>Request and Response Format</h2>
<p>The API accepts and returns JSON objects. The request and response format for each endpoint is as follows:</p>

<h3>GET /api/courses</h3>
<p>Returns a list of all courses.</p>
<h4>Request</h4>
<p>No request body is required.</p>
<h4>Response</h4>
<p>Returns an array of course objects. Each course object contains the following properties:</p>
<ul>
	<li>id: The ID of the course (integer)</li>
	<li>name: The name of the course (string)</li>
	<li>description: The description of the course (string)</li>
	<li>credit: The credit of the course (integer)</li>
</ul>

<h3>GET /api/courses/{id}</h3>
<p>Returns a single course by its ID.</p>
<h4>Request</h4>
<p>No request body is required.</p>
<h4>Response</h4>
<p>Returns a single course object with the following properties:</p>
<ul>
	<li>id: The ID of the course (integer)</li>
	<li>name: The name of the course (string)</li>
	<li>description: The description of the course (string)</li>
	<li>credit: The credit of the course (integer)</li>
</ul>

<h3>POST /api/courses</h3>
<p>Creates a new course.</p>
<h4>Request</h4>
<p>Requires a JSON object with the following properties:</p>
<ul>
	<li>name: The name of the course (string)</li>
	<li>description: The description of the course (string)</li>
	<li>credit: The credit of the course (integer)</li>
</ul>
<h4>Response</h4>
<p>Returns the ID of the newly created course.</p>

