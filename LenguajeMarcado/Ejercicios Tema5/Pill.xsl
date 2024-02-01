<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">

        <html>
            <head>Pildoras</head>
            <body>
                <table border="1">
                    <tr>
                        <th>Color</th>
                        <th>Caracteristicas</th>
                        <th>Representante</th>
                    </tr>
                    <xsl:for-each select="Pills/Pildora">
                        <tr>
                            <td>
                                <xsl:value-of select="Color" />
                            </td>
                            <td>
                                <xsl:value-of select="Caracteristicas" />
                            </td>
                            <td>
                                <xsl:value-of select="Representantes" />
                            </td>
                        </tr>
                    </xsl:for-each>


                </table>
            </body>

        </html>
    </xsl:template>
</xsl:stylesheet>