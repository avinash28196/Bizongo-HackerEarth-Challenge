import React from 'react';


function TableData (props) {
  return (

      <tr>
        <th scope="row">{props.id}</th>
        <td>{props.name}</td>
        <td>{props.year}</td>
        <td>{props.platform}</td>
        <td>{props.genre}</td>
        <td>{props.publisher}</td>
        <td>{props.globalsale}</td>
      </tr>

  );
}

export default TableData;
