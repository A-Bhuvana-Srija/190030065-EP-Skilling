<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:template match="/Students">
		<html>
			<body>
				<h1 align="center">Student Table</h1>
				<table border="1" align="center">
					<tr>
						<th bgcolor="yellow">SNo.</th>
						<th bgcolor="yellow">Student Name</th>
						<th bgcolor="yellow">Student Email</th>
						<th bgcolor="yellow">Marks</th>
						<th bgcolor="yellow">Class</th>
					</tr>
					<xsl:for-each select="student">
						<tr>
							<td>
								<xsl:value-of select="no"/>
							</td>
							<td bgcolor="green">
								<xsl:value-of select="name"/>
							</td>
							<td bgcolor="pink">
								<xsl:value-of select="email"/>
							</td>
							<td bgcolor="orange">
								<xsl:value-of select="marks"/>
							</td>
							<td bgcolor="blue">
								<xsl:value-of select="class"/>
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>