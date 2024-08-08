<mxfile host="app.diagrams.net" modified="2024-08-08T07:11:38.501Z" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36" etag="EUYok4qmukV5-h1ZjUgW" version="24.6.4" type="device">
  <diagram name="Página-1" id="BQj9cWNkSxRbcnEp3O8L">
    <mxGraphModel dx="1250" dy="648" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="vP5oMVeFVMzfpeTG8JPm-1" value="Planet" style="swimlane;fontStyle=0;childLayout=stackLayout;horizontal=1;startSize=26;fillColor=none;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="200" y="240" width="220" height="310" as="geometry" />
        </mxCell>
        <mxCell id="vP5oMVeFVMzfpeTG8JPm-2" value="- name: String" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="vP5oMVeFVMzfpeTG8JPm-1">
          <mxGeometry y="26" width="220" height="26" as="geometry" />
        </mxCell>
        <mxCell id="vP5oMVeFVMzfpeTG8JPm-3" value="- nameOfSatellites: int" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="vP5oMVeFVMzfpeTG8JPm-1">
          <mxGeometry y="52" width="220" height="26" as="geometry" />
        </mxCell>
        <mxCell id="vP5oMVeFVMzfpeTG8JPm-4" value="- mass: double&lt;div&gt;&lt;br&gt;&lt;div&gt;- volume: double&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;- diameter: double&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;- averageDistanceToSun: double&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;- planetType: PlanetType&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;- isVisibleTonakedEye: boolean&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;- orbitalPeriod: double&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;- rotationPeriod: double&lt;/div&gt;&lt;/div&gt;" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="vP5oMVeFVMzfpeTG8JPm-1">
          <mxGeometry y="78" width="220" height="232" as="geometry" />
        </mxCell>
        <mxCell id="vP5oMVeFVMzfpeTG8JPm-24" value="&lt;div&gt;+ getters &amp;amp; setters for each attribute&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;div&gt;+ calculateDensity(): double&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;+ isOuterPlanet(): boolean&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;+ isInnerPlanet(): boolean&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;+ isInAsteroidBelt: boolean&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;+ displayInfo(): void&lt;/div&gt;&lt;/div&gt;" style="text;strokeColor=default;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="200" y="550" width="220" height="180" as="geometry" />
        </mxCell>
        <mxCell id="vP5oMVeFVMzfpeTG8JPm-25" value="PlanetType" style="swimlane;fontStyle=0;childLayout=stackLayout;horizontal=1;startSize=26;fillColor=none;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="520" y="240" width="140" height="104" as="geometry" />
        </mxCell>
        <mxCell id="vP5oMVeFVMzfpeTG8JPm-26" value="+ GASEOUS" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="vP5oMVeFVMzfpeTG8JPm-25">
          <mxGeometry y="26" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="vP5oMVeFVMzfpeTG8JPm-27" value="+ TERRESTRIAL" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="vP5oMVeFVMzfpeTG8JPm-25">
          <mxGeometry y="52" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="vP5oMVeFVMzfpeTG8JPm-28" value="+ DWARF" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="vP5oMVeFVMzfpeTG8JPm-25">
          <mxGeometry y="78" width="140" height="26" as="geometry" />
        </mxCell>
        <mxCell id="vP5oMVeFVMzfpeTG8JPm-31" value="" style="endArrow=none;html=1;edgeStyle=orthogonalEdgeStyle;rounded=0;exitX=0.999;exitY=0.288;exitDx=0;exitDy=0;exitPerimeter=0;entryX=-0.009;entryY=0.186;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="1" source="vP5oMVeFVMzfpeTG8JPm-4" target="vP5oMVeFVMzfpeTG8JPm-25">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="510" y="380" as="sourcePoint" />
            <mxPoint x="670" y="380" as="targetPoint" />
            <Array as="points">
              <mxPoint x="460" y="385" />
              <mxPoint x="480" y="385" />
              <mxPoint x="480" y="259" />
            </Array>
          </mxGeometry>
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>